import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student other) {
        // return Integer.compare(this.rollNo, other.rollNo); // Sort by roll number
        // return String.CASE_INSENSITIVE_ORDER.compare(this.name,other.name); // Sort by name alphabetically
        if(other.rollNo%2==0){ //Sort by Even roll number
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return name + " (Roll No: " + rollNo + ")";
    }
}

public class AboutComparableInterface{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
        Collections.sort(numbers); // Uses the natural ordering (ascending)
        System.out.println("Sorted Numbers: " + numbers);

        List<String> strings = Arrays.asList("banana", "apple", "orange");
        Collections.sort(strings); // Uses the natural ordering (lexicographical)
        System.out.println("Sorted Strings: " + strings);

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 5));
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 8));
        students.add(new Student("Jane", 7));
        System.out.println("Before Sorting Students: " + students);

        Collections.sort(students); // Sorts using the compareTo method
        System.out.println("Sorted Students: " + students);
    }
}
