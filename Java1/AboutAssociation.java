// Class representing a Student
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Teacher
class Teacher {
    static String name;
    static int numberOfStudents=0;
    static Student students[] = new Student[5];

    public Teacher(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students[numberOfStudents]=student;
        numberOfStudents++;
    }

    public void displayStudents() {
        System.out.println("Teacher: " + name);
        for (int i=0;i<numberOfStudents;i++) {
            System.out.println("Student: " + students[i].getName());
        }
    }
}

// Aggregration
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return name;
    }
}

class University {
    static Department departments[] = new Department[5];
    static int counts=0;

    public void addDepartment(Department dept) {
        departments[counts]=dept;
        counts++;
    }

    public void displayDepartments() {
        for (int i=0;i<counts;i++) {
            System.out.println("Department: " + departments[i].getDepartmentName());
        }
    }
}


//Composition
class Engine {
    void start() {
        System.out.println("Engine is starting...");
    }
}

class Car {
    private Engine engine;

    public Car() {
        engine = new Engine();  // Engine is created inside Car
    }

    public void startCar() {
        engine.start();
    }
}

public class AboutAssociation{

    public static void main(String args[]){

        // Association 
        Student s1=new Student("Robin");
        Student s2=new Student("Aaron");
        Teacher t1= new Teacher("Mary");
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.displayStudents();

        //Aggregration
        Department math=new Department("Maths");
        Department science=new Department("Science");
        University uni = new University();
        uni.addDepartment(math);
        uni.addDepartment(science);
        uni.displayDepartments();

        //Composition
        Car car = new Car();
        car.startCar();
        
    }
}