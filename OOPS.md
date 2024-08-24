# About OOPS (Object-Oriented Programming System)

- So when a car was introduce, a blueprint of a car was prepared, like what could be requirements to built a car? , this included color, Engine , cylinder and etc..
- So imagine referring this blue print, there is a Ferrari car, so what could be its properties?  color - red, Engine - 3902 cc, No. of cylinder - 4 and so on.. what could be his behaviour? so the behaviors - Start engine, Accelerate, Brake, Turn, Park.
- **Class**: Is the blueprint to built a car.
- **Object**: Is Ferrari
- **Data**: Is Ferrari properties
- **Method**: Is Ferrari behaviour.

- So OOP basically organize your code structure by defining a class which acts as a blueprint. It consists a set of properties (data) and methods (behaviors). It provides a general template for what an object can be and do.
- To use the class, you create or instantiate an object. The object is a specific instance of the class, with its own customized properties using the properties of class (like a red Ferrari with a 3902 cc engine) and access to the methods defined in the class.
- When you instantiate an object, you can set its properties to match what you need, and then use its methods to perform actions. This approach helps in organizing code, making it more modular, reusable, and easier to manage.

![alt text](image.png)

```
package OOPS;

class Car{

    int speed;
    int numberOfCyclinder;

    public void startEngine(){
        System.out.println("Engine Started..."+", speed - "+speed+", cyclinder - "+numberOfCyclinder);
    }
}

public class SimpleOOP {
    public static void main(String[] args) {
        
        /**
         * Ferrari
         */
        Car ferrari= new Car(); //Reference variable
        ferrari.speed=230;
        ferrari.numberOfCyclinder=4;
        ferrari.startEngine();
    }
}

Output
Engine Started..., speed - 230, cyclinder - 4
```

- Lets create a mustang 


```
package OOPS;

class Car{

    int speed;
    int numberOfCyclinder;

    public void startEngine(){
        System.out.println("Engine Started..."+", speed - "+speed+", cyclinder - "+numberOfCyclinder);
    }
}

public class SimpleOOP {
    public static void main(String[] args) {
        
        /**
         * Ferrari
         */
        Car ferrari= new Car(); //Reference variable
        ferrari.speed=230;
        ferrari.numberOfCyclinder=4;
        ferrari.startEngine();

        /**
         * Mustang
         */
        Car mustang= new Car(); //Reference variable
        mustang.speed=200;
        mustang.numberOfCyclinder=3;
        mustang.startEngine();

    }
}

Output:
Engine Started..., speed - 230, cyclinder - 4
Engine Started..., speed - 200, cyclinder - 3
```

- The JVM creates these objects, so there could possibilities like there can be multiple types of cars like TATA, Tesla, etc.. how to identify each? thats where every object has a unique identifier.

```
package OOPS;

class Car{

    int speed;
    int numberOfCyclinder;

    public void startEngine(){
        System.out.println("Engine Started..."+", speed - "+speed+", cyclinder - "+numberOfCyclinder);
    }
}

public class SimpleOOP {
    public static void main(String[] args) {
        
        /**
         * Ferrari
         */
        Car ferrari= new Car(); //Reference variable
        ferrari.speed=230;
        ferrari.numberOfCyclinder=4;
        ferrari.startEngine();

        /**
         * Mustang
         */
        Car mustang= new Car(); //Reference variable
        mustang.speed=200;
        mustang.numberOfCyclinder=3;
        mustang.startEngine();

        /**
         * Unique Identifier
         */
        System.out.println("Unique Identifier for ferrari - "+System.identityHashCode(ferrari));
        System.out.println("Unique Identifier for mustang - "+System.identityHashCode(mustang));
    }
}


Output:
Engine Started..., speed - 230, cyclinder - 4
Engine Started..., speed - 200, cyclinder - 3
Unique Identifier for ferrari - 791452441
Unique Identifier for mustang - 142257191
```

- An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

- Lets deep dive more into class. So lets say inside a class each variable has a scope.

```
class Car{

    int speed; // Instance variable
    int numberOfCyclinder;

    public void startEngine(){
        System.out.println("Engine Started..."+", speed - "+speed+", cyclinder - "+numberOfCyclinder);
    }

    public void speedLimit(){
        int i=200; // Local variable
    }
}
```

- **Local variable**: 
    - Scope: Declared within a method, constructor, or block of code (e.g., inside loops or conditional statements).
    - Lifetime: Created when the method is called and destroyed when the method exits. They are not accessible outside the method in which they are declared.
    - Initialization: Must be initialized before use; otherwise, the compiler will throw an error.
- **Instance variable**:
    - Scope: Declared inside a class but outside any method, constructor, or block. They are associated with an instance of the class (each object has its own copy).
    - Lifetime: Exist as long as the object (instance of the class) exists. They are created when the object is created using the new keyword and destroyed when the object is destroyed.
    - Initialization: Automatically initialized to default values if not explicitly initialized (e.g., 0 for integers, null for objects).

>[!IMPORTANT]
> - Java does not support the concept of "nested" methods (a method within another method). All methods in Java are defined at the class level. Therefore, you cannot declare a method inside another method.
> - Java does support nested classes.

## What is String?

- In Java, a String is a sequence of characters and is one of the most commonly used classes in the Java programming language. The String class is part of the `java.lang` package and is used to create and manipulate strings (text).

```
public class AboutStrings {
    public static void main(String[] args) {
        
        /**
         * Initializing a value in String
         */
        String n=new String();
        n="Harsh";
        System.out.println(n);

        String n1=new String("Pandya");
        System.out.println(n+" "+n1);
    
        String n2="Mr.";
        System.out.println(n2+" "+n+" "+n1);
    }
}


Output:
Harsh
Harsh Pandya
Mr. Harsh Pandya
```

- Lets say you have two string variables which stores the same value. What do you thing the reference object are same or different?

```
        /**
         * Points the same reference object in the string pool of heap memory
         */
        String s1="welcome";
        String s2="welcome";
        String s3="Welcome"; // New String literal

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


Output:
1233099618
1233099618
-1397214398
```

- It is the same. Java uses a special memory area called the **String Pool** to store string literals or value. When a string literal is created, the JVM checks the string pool to see if an identical string already exists. If it does, the new reference points to the existing string. If not, a new string is created in the pool.

![alt text](image-6.png)

>[!IMPORTANT]
> - If we explicitly specify **`String str=new String("Explicitly telling java to create a new Object but still it won't create")`** then still it will search in String pool. If literal is not available then only its creates a new object of string.

### Common String methods

```
        String str = "Hello";
        int len = str.length(); // 5
        char c = str.charAt(1); // 'e'
        String sub = str.substring(1, 4); // "ell"
        boolean isEqual = str.equals("Hello"); // true
        String greeting = str.concat(" World"); // "Hello World"

        String strWithSpaces = "   Hello World   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmed + "'"); // Output: Trimmed: 'Hello World'

        String replaced = str.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replaced); // Output: Replaced 'o' with 'a': Hella Warld

        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains); // Output: Contains 'World': true

        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello world");
        System.out.println("Equals Ignore Case 'hello world': " + isEqualIgnoreCase); // Output: Equals Ignore Case 'hello world': true

        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith); // Output: Starts with 'Hello': true

        boolean endsWith = str.endsWith("World");
        System.out.println("Ends with 'World': " + endsWith); // Output: Ends with 'World': true
        
        String[] parts = str.split(" ");
        System.out.println("Split by space: ");
        for (String part : parts) {
            System.out.println(part);
        }
        // Output:
        // Split by space:
        // Hello
        // World
```

### Immutable and Mutable String (String, String Buffer, String Builder)

#### Immutable (String)

- Strings in Java are **immutable**, which means once a String object is created, it cannot be changed. Any modification to a string creates a new String object.

```
String str = "Hello";
str = str + " World";  // A new string "Hello World" is created, "str" now references the new string
```
- **Usage**: Best used when the string content is not expected to change frequently, such as for string literals or small concatenations.
- **Performance**: Since strings are immutable, every modification (like concatenation) creates a new object, which can be inefficient, especially in loops or when handling large amounts of data.

#### Mutable (String Buffer, String Builder)

##### String Buffer

- **Mutable**: Unlike String, **StringBuffer** allows modification of the string content without creating new objects.
- **Thread-Safe**: **StringBuffer** is synchronized, meaning it is safe to use in a multi-threaded environment where multiple threads might access and modify the string simultaneously.
- **Usage**: Use **StringBuffer** when you need to perform many modifications on a string in a multi-threaded environment.
- **Performance**: It is slower than **StringBuilder** due to the overhead of synchronization but faster than String for string modifications.

```
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Output: Hello World
```

##### String Builder

- **Mutable**: Like **StringBuffer**, **StringBuilder** allows modification of the string content.
- **Not Thread-Safe**: **StringBuilder** is not synchronized, meaning it is not safe to use in a multi-threaded environment without additional synchronization.
- **Usage**: Use **StringBuilder** when you need to perform many modifications on a string in a single-threaded environment. It's more efficient than StringBuffer because it doesn’t have the synchronization overhead.
- **Performance**: It is the fastest option for string modification when thread safety is not a concern.

```
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Output: Hello World
```

>[!NOTE]
> - In-built methods which are applicable for string are also applicable for String builder as well as String buffer.

## Static

- Lets create a student class and reference object of it.

```
class Student{
    String schoolname;
    int id;
    int marks;

    public void details(){
        System.out.println("School name: "+schoolname+" ,ID: "+id+" ,marks: "+marks);
    }
}

public class AboutStatic {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.schoolname="IIT";
        s1.id=1;
        s1.marks=95;

        Student s2=new Student();
        s2.schoolname="BITS";
        s2.id=2;
        s2.marks=95;

        s1.details();
        s2.details();
    }
}

Output:
School name: IIT ,ID: 1 ,marks: 95
School name: BITS ,ID: 2 ,marks: 95
```

- Lets add **static** keyword against the `schoolname` variable and then lets try to execute the same code.

```
class Student{
    static String schoolname;
    int id;
    int marks;

    public void details(){
        System.out.println("School name: "+schoolname+" ,ID: "+id+" ,marks: "+marks);
    }
}

public class AboutStatic {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.schoolname="IIT";
        s1.id=1;
        s1.marks=95;

        Student s2=new Student();
        s2.schoolname="BITS";
        s2.id=2;
        s2.marks=96;

        s1.details();
        s2.details();
    }
}


Output:
School name: BITS ,ID: 1 ,marks: 95
School name: BITS ,ID: 2 ,marks: 96
```

- Why so we got `BITS` for reference object 1?, this is because a static variable is a variable that belongs to the class rather than to any specific instance (object) of the class. It is shared among all instances of the class. Only one copy of a static variable is created and shared across all objects of that class.
- Static variables are useful when you want to share a common piece of data across all instances of a class. For example, a variable that counts the number of instances of a class created.
- What if the **static** key word is applied on method? , lets apply static keyword on the `details()` method.

```
class Student{
    static String schoolname;
    int id;
    int marks;

    public static void details(){
        System.out.println("School name: "+schoolname+" ,ID: "+id+" ,marks: "+marks);
    }
}

public class AboutStatic {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.schoolname="IIT";
        s1.id=1;
        s1.marks=95;

        Student s2=new Student();
        s2.schoolname="BITS";
        s2.id=2;
        s2.marks=96;

        s1.details();
        s2.details();

        
    }
}
```

![alt text](image-8.png)

- We got an error **`Cannot make a static reference to the non-static field id, Cannot make a static reference to the non-static field marks`**. So basically there is 1 value for the variable **schoolname** since it is a static variable, but there are 2 values of **id** and **marks** (`s1.id=1,s2.id=2` and `s1.marks=95,s2.marks=96`) , these are non-static variables. Now since there are two different values, how will the static method will get to know which one to be called and printed?
- Thats why we can use **a static variable inside a static method but we cannot use a non-static variable inside a static method**.
- Lets do a work around, now if a static method is confused which values to be printed out what if we pass the reference object to clear out the confusion?

```
class Student{
    static String schoolname;
    int id;
    int marks;

    public static void details(Student obj){
        System.out.println("School name: "+schoolname+" ,ID: "+obj.id+" ,marks: "+obj.marks);
    }
}

public class AboutStatic {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.schoolname="IIT";
        s1.id=1;
        s1.marks=95;

        Student s2=new Student();
        s2.schoolname="BITS";
        s2.id=2;
        s2.marks=95;

        s1.details(s2);
        s2.details(s1);

        
    }
}

Output:
School name: BITS ,ID: 2 ,marks: 95
School name: BITS ,ID: 1 ,marks: 95
```

- So **by passing out the reference object we can use non-static variable can be access in static method**


### Why Should We Call Static Members via Class Name and Not Object Name?

- We see below warnings which says 

![alt text](image-9.png)

- **Clarity and Intent**: Calling static methods or accessing static variables via the class name makes it clear that these members belong to the class, not to any specific instance. It clarifies that the method or variable is not dependent on the state of any particular object.
- **Avoid Confusion**: If you call a static method using an object, it can give the false impression that the method is tied to the instance's state, which it is not. Using the class name prevents this confusion.
- **Language Specification**: Java language specification allows calling static methods through objects, but it's not recommended as it goes against the intended use of static members.

```
class Student{
    static String schoolname;
    int id;
    int marks;

    public static void details(Student obj){
        System.out.println("School name: "+schoolname+" ,ID: "+obj.id+" ,marks: "+obj.marks);
    }
}

public class AboutStatic {
    public static void main(String[] args) {
        
        Student s1=new Student();
        Student.schoolname="IIT";
        s1.id=1;
        s1.marks=95;

        Student s2=new Student();
        Student.schoolname="BITS";
        s2.id=2;
        s2.marks=95;

        Student.details(s2);
        Student.details(s1);

        
    }
}
```

### Static on Class

- In Java, top-level classes (classes that are not nested within another class) cannot be declared as static. **This is because the static keyword implies that something belongs to the class itself rather than an instance of the class**. A top-level class itself is not contained within another class, so the concept of **static** does not apply in this context.

```
static class TopLevelClass { // Compilation error -> Illegal modifier for the class Student; only public, abstract & final are permitted
    // ...
}
```

- Though static cannot be applied on top-level class but it can be applied on nested classes.

```
class OuterClass {
    int i; // Instance variable
    static int j; // Static variable or Class variables 
    // Static nested class or Static member inner classes
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside static nested class "+OuterClass.j);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // No need to create an instance of the outer class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display(); // Output: Inside static nested class
    }
}

Output:
Inside static nested class 0
```

>[!IMPORTANT]
> - Static variables (also known as class variables) are associated with the class itself rather than with any particular instance of the class. They are shared across all instances of a class. Static variables are declared at the class level, outside any method.
> - Static variables cannot be defined under any method.


#### Key Points about Static Nested Classes:
- A static nested class can access the static members (variables and methods) of the outer class.
- A static nested class cannot directly access the non-static members of the outer class. It must use an instance of the outer class to do so.
- Instances of a static nested class are not tied to instances of the outer class.

## Array Objects

- In Java, an Array of Objects refers to an array that can store references to objects of a particular class. Just like arrays of primitive types (e.g., int[], char[]), an array of objects can store multiple elements, but each element is a reference to an instance of a class.

```

class Student{
    int rollnumber;
    String name;
    long marks;
}


public class ArrayObjects{
    public static void main(String[] args) {
        
        /**
         * Creating references objects for student class
         */
        Student s1=new Student();
        s1.rollnumber=1;
        s1.marks=90;
        s1.name="Harsh";

        Student s2=new Student();
        s2.rollnumber=2;
        s2.marks=97;
        s2.name="Meet";

        Student[] ArrayObject = {s1,s2};
        for(Student s:ArrayObject){
            System.out.println(s.name+" , "+s.marks+" , "+s.rollnumber);
        }
    }
}

Output:
Harsh , 90 , 1
Meet , 97 , 2
```

- An array of objects in Java allows you to store multiple objects of a particular class in a single data structure.
- You must create each object individually before storing it in the array.
- Once stored, you can access and manipulate these objects using their index in the array.


## Method Overloading

- Lets say we have a class calculator , for which we need add two numbers and returns the value. Uptil now we have used **void** which means that the method won't return anything , now the method will compute and return a integer value.

```
package OOPS;


class Calculator{

    public int add(int n1,int n2){

        /**
         * Method add returns the sum of n1+n2
         */
        return n1+n2;
    }
    
}

public class MethodOverloading {
    
    public static void main(String[] args) {
        
        Calculator twoNums=new Calculator();
        /**
         * Passing 4 and 5 required arguments for method "add"
         */
        System.out.println("Addition of 5 and 4 is "+twoNums.add(4, 5));
    }
}

Output:
Addition of 5 and 4 is 9
```

- Now lets say there is a requirement like , sometimes you may get 3 numbers or you may get 2 numbers, now you could create another method inside the class. The method could be **add1** since there exists already an **add** method. Here we have taken example of 2 - 3 variables addition, tomorrow there could be n number of variables addition , how do that ? java says, hey programmer since you have different number of arguments inside your add method , you can still create a method with same name i.e **add**.

```
package OOPS;


class Calculator{

    public int add(int n1,int n2){

        /**
         * Method add returns the sum of n1+n2
         */
        return n1+n2;
    }

    /**
     * Method Overloading by parameters
     */
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    
}

public class MethodOverloading {
    
    public static void main(String[] args) {
        
        Calculator twoNums=new Calculator();
        /**
         * Passing 4 and 5 required arguments for method "add"
         */
        System.out.println("Addition of 5 and 4 is "+twoNums.add(4, 5));
        System.out.println("Addition of 5,4 and 6 is "+twoNums.add(5, 4,6));
    }
}

Output:
Addition of 5 and 4 is 9
Addition of 5,4 and 6 is 15
```

- Lets say we wanna add two floating point numbers.

```
package OOPS;


class Calculator{

    public int add(int n1,int n2){

        /**
         * Method add returns the sum of n1+n2
         */
        return n1+n2;
    }

    /**
     * Method Overloading by parameters
     */
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    /**
     * Method Overloading by type
     */
    public double add(double n1,double n2){
        return n1+n2;
    }
}

public class MethodOverloading {
    
    public static void main(String[] args) {
        
        Calculator twoNums=new Calculator();
        /**
         * Passing 4 and 5 required arguments for method "add"
         */
        System.out.println("Addition of 5 and 4 is "+twoNums.add(4, 5));
        System.out.println("Addition of 5,4 and 6 is "+twoNums.add(5, 4,6));
        System.out.println("Addition of 5.5 and 4.5 is "+twoNums.add(4.5, 5.5));

    }
}


Output:
Addition of 5 and 4 is 9
Addition of 5,4 and 6 is 15
Addition of 5.5 and 4.5 is 10.0
```

>[!NOTE]
> - Overloading property is only associated with method and not with variables and classes


