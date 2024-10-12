import java.util.*;

class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return name + " (Roll No: " + rollNo + ")";
    }
}

class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo); // Sort by roll number
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Sort by name
    }
}

class RollNoNameComparator implements Comparator<Student>{


    @Override
    public int compare(Student s1, Student s2) {
        // Primary comparison by roll number
        int rollComparison = Integer.compare(s1.rollNo, s2.rollNo);
        // Secondary comparison by name if roll numbers are equal
        if (rollComparison == 0) {
            return s1.name.compareTo(s2.name); // Sort by name
        }
        return rollComparison;
    }
    
}

public class AboutComparatorInterface {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 5));
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 8));
        students.add(new Student("Ali", 8));

        System.out.println("Before Sorting: "+students);

        // Sort by roll number using the RollNoComparator
        Collections.sort(students, new RollNoComparator());
        System.out.println("Sorted Students by Roll No: " + students);

        // Sort by name using the NameComparator
        Collections.sort(students, new NameComparator());
        System.out.println("Sorted Students by Name: " + students);

        // Sort by roll number first, if numbers are same then sort by name
        Collections.sort(students, new RollNoNameComparator());
        System.out.println("Sorted Students by Name: " + students);     

    }
}
