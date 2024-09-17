## Deep dive in Memory Management or Memory Allocation

#### What is Virtual Memory?

- Virtual memory is a memory management technique where secondary memory can be used as if it were a part of the main memory. Virtual memory is a common technique used in a computer's operating system (OS).
- Virtual memory uses both hardware and software to enable a computer to compensate for physical memory shortages, temporarily transferring data from random access memory (RAM) to disk storage. Mapping chunks of memory to disk files enables a computer to treat secondary memory as though it were main memory.
-  It frees up space in RAM (Physicall memory) by swapping data (that has not been used recently) to disk storage.

![alt text](Images/memorymanagement/image-1.png)

- These virtual memory sections are used in a program for storing the variables and instances of structures and classes. However, physical memory isn’t allocated to an object at declaration; only a reference is created. **The memory is allocated to the object only after it is created using the new keyword. This process of allocating dedicated virtual memory spaces to the programs and services is referred to as Memory Allocation**.
- Every time a new variable or object is declared, Java uses an automatic memory management system that allocates or deallocates memory to objects or variables. Java memory management divides into two major parts:
    - JVM
    - Garbage Collector - It is mainly responsible for de-allocating memory from objects and variables when they are no longer required. This freed-up space is then available for new Objects and variables.
- Java applications need a certain amount of RAM on a computer to run. Each time an object or variable is declared, it needs more RAM. For that purpose, the Java Virtual Machine (JVM) divides memory between Java Heap Space and Java Stack Memory.
- The Java Memory Allocation is divided into the following sections :
    - Heap ⇒ contains Objects (may also include reference variables)
    - Stack ⇒ contains methods, local variables, and reference variables.
    - Code ⇒ contains your bytecode (.class (after compilation) files in java)

#### Stack Memory

- In terms of data structure, stack is refered as Last-In-First-Out order. The stack is a linear data structure that is used to store the collection of objects.

![alt text](Images/memorymanagement/image-2.png)

![alt text](Images/memorymanagement/image-3.png)

- **Stack memory** is the temporary memory where variable values are stored when their methods are invoked. After the method is finished, the memory containing those values is cleared to make room for new methods. Any values in this block are only accessible by the current method and will not exist once it ends. When the method ends, that block will be erased. The next method invoked will use that empty block.

#### Heap Memory or dynamic memory

>[!IMPORTANT]
> - **The heap in the JVM and the heap in data structures are different concepts, even though they share the same name.**

-  In the JVM, the heap is a portion of memory used for dynamic memory allocation. It's where objects and their associated instance variables are stored. Whenever you create an object using the `new` keyword, the memory for that object is allocated from the heap.
- Managed by the JVM's garbage collector, which automatically frees up memory that is no longer in use (i.e., when there are no more references to an object).
- The heap is shared across all threads in a Java application, meaning that objects in the heap can be accessed by multiple threads.
- The heap doesn't follow any specific data structure or order. It's simply a pool of memory where the JVM allocates and deallocates space for objects as needed.
- Objects in the heap have a lifespan that can extend beyond the method that created them, as long as there are references to them.

##### String Pool

- String Pool in java is a pool of Strings stored in Java Heap Memory. We know that String is a special class in java and we can create String objects using a new operator as well as providing values in double-quotes.

![alt text](Images/memorymanagement/image-5.png)

- When we use double quotes to create a String, it first looks for String with the same value in the String pool, if found it just returns the reference else it creates a new String in the pool and then returns the reference. However using new operator, we force String class to create a new String object in heap space.

#### Example of Memory Managment using Code.

- Consider below class

```
package com.journaldev.test;

public class Memory {

	public static void main(String[] args) { $// Line 1$
		int i=1; // Line 2
		Object obj = new Object(); // Line 3
		Memory mem = new Memory(); // Line 4
		mem.foo(obj); // Line 5
	} // Line 9

	private void foo(Object param) { // Line 6
		String str = param.toString(); // Line 7
		System.out.println(str);
	} // Line 8

}
```

![alt text](Images/memorymanagement/image-4.png)


- As soon as we run the program, it loads all the Runtime classes into the Heap space. When the `main()` method is found at line 1, Java Runtime creates stack memory to be used by the `main()` method thread, `public static void main(String[] args) { ... }`
- We are creating a primitive local variable at line 2, so it’s created and stored in the stack memory of the `main()` method, **int i=1;**
- Since we are creating an Object in the 3rd line, it’s created in heap memory and stack memory contains the reference for it. A similar process occurs when we create a Memory object in the 4th line.

```
Object obj = new Object(); // Line 3
Memory mem = new Memory(); // Line 4
```

- Now when we call the `foo()` method in the 5th line, a block at the top of the stack is created to be used by the `foo()`. Since Java is pass-by-value, a new reference to Object is created in the `foo()` stack block in the 6th line.

```
mem.foo(obj); // Line 5
private void foo(Object param) { … } // Line 6
```

- A string is created in the 7th line, it goes in the String Pool in the heap space and a reference is created in the `foo()` stack space for it. `String str = param.toString();` // Line 7

- The `foo()` method is terminated in the 8th line, at this time memory block allocated for `foo()` in the stack becomes free.
- In line 9, the `main()` method terminates and the stack memory created for the `main()` method is destroyed. Also, the program ends at this line, hence Java Runtime frees all the memory and ends the execution of the program.

- [References](https://medium.com/@tabassum_k/memory-allocation-in-java-heap-and-stack-8197aec4accb)

#### Have wonder why are we using stack data structure?

- In programming, when a method is called, the current method might call another method, which might in turn call another one, and so on. The most recently called method needs to finish execution before the previous one can continue. This pattern of execution is naturally suited to a stack's LIFO order.
- Consider below example

```
void methodA() {
    methodB();
}

void methodB() {
    methodC();
}

void methodC() {
    // do something
}
```

- `methodA` is called from `main()`.

```
+-------------------------+
|      main() Frame        |
+-------------------------+
|     ...                  |
+-------------------------+
|     methodA() Frame      |
+-------------------------+
```

- `main()` frame: The initial stack frame where execution starts. Pushed `methodA()` onto the stack when `methodA` is called in `main()`.

```
+-------------------------+
|      main() Frame        |
+-------------------------+
|     methodA() Frame      |
+-------------------------+
|     methodB() Frame      |
+-------------------------+
```

- `methodA()` frame remains on the stack. `methodB()` frame is pushed onto the stack when methodB is called from `methodA`.

```
+-------------------------+
|      main() Frame        |
+-------------------------+
|     methodA() Frame      |
+-------------------------+
|     methodB() Frame      |
+-------------------------+
|     methodC() Frame      |
+-------------------------+
```

- `methodB()` frame remains on the stack. `methodC()` frame is pushed onto the stack when methodC is called from `methodB`.
- The stack frame for `methodC` is active, and it contains local variables and the return address.
- Once `methodC` completes, its stack frame is popped off.

```
+-------------------------+
|      main() Frame        |
+-------------------------+
|     methodA() Frame      |
+-------------------------+
|     methodB() Frame      |
+-------------------------+
```

- Returning from `methodB` to `methodA`

```
+-------------------------+
|      main() Frame        |
+-------------------------+
|     methodA() Frame      |
+-------------------------+
```

- Thus this operation involes Last-In-First-Out hence stack data structure is used.
- Another example dipicted in the below image itself

![alt text](Images/memorymanagement/image-6.png)

#### What is the size of Class?

- Consider the below Car class

```
package OOPS;

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
```

- Here we have created a variable with name **ferrari** which is has a data type of **Car** , just like **int a**, but what will be its size? for int we have 4 bytes so we get a space of 32 bits in memory, what will be the space for type **Car**?
- When you call `new ClassName()`, Java allocates memory for the new object on the heap. The size of this memory is determined by the class's properties (fields). Each field in the class contributes to the overall size of the object.
- After allocating memory, the constructor of the class is called to initialize the object's properties. The constructor is a special method that sets up the initial state of the object.
- If you haven't defined a constructor, Java provides a default one that initializes fields to default values (e.g., 0 for integers, null for objects).

```
class Car {

    int speed; // Instance variable
    int numberOfCyclinder;

    // Constructor
    Car(int speed, int numberOfCyclinder) {
        this.speed = speed;
        this.numberOfCyclinder = numberOfCyclinder;
    }
}
```

- After the constructor finishes executing, the new keyword returns a reference to the newly created object. This reference is typically stored in a variable so that you can interact with the object.


### Memory Management for Static fields

- Memory for non-static variable is created at the time of create an object of class but memory for static variable is created only one in the program at the time of loading of class.

#### Memory Areas in Java Before Java 8

- https://www.linkedin.com/pulse/memory-management-java-softyoi-llp-wxrsf/

where is interfaces present in memory management? abstract class ? static variables methods
- types of interfaces, abstract, classes, sealed classes and interfaces
- extends must be written before implements , but implements cannot be before extends
- concept of nested classes and its type, for normal class static class abstract class , interfaces, class and interfaces method nested with class.
- record classes. (Seperate markdown with all new java features)
*We will explore String buffer and String builder when we will learn about threads*
- Serialization an marker interface example toh vo maker ka part hai aisa batana hai
- simple date local date dd-mm-yyyy or YYYYY
- what is psvm?
- finalize
- The Buffer class in Java NIO (New I/O) provides the foundation for working with buffers. It's an abstract class with subclasses for different primitive data types (e.g., ByteBuffer, CharBuffer, IntBuffer).
- transient
- 