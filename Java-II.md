# Java Concepts

## Lambda Expression

- Lets say you have a Functional interface, and you implement this interface using anonymous class.

```
package Java2;

@FunctionalInterface
interface A{
    void show();
}


public class AboutLambdaExpression{
    public static void main(String[] args) {
        
        /**
         * Anonymous class
         */
        A a = new A() {
            public void show(){
                System.out.println("In A show");
            }
        };

        a.show();
    }
}

Output:
In A show
```

- You can reduce the above code to below code.

```
package Java2;

@FunctionalInterface
interface A{
    void show();
}


public class AboutLambdaExpression{
    public static void main(String[] args) {
        A a = () ->System.out.println("In A show");
        a.show();
    }
}

Output:
In A show
```

- This is an example of Lambda expression.
- The Lambda expression is used to provide the implementation of an interface which has functional interface or single abstract method interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again (just like in anonymous class we had define `public void show()`) for providing the implementation. Here, we just write the implementation code.
- Lambda expression provides implementation of functional interface. Behind the scene , `()->` it is instantiating a `new A()`.
- Lets see how lambda expression works when there are parameters in your method.

```
@FunctionalInterface
interface B{
    void doubleTheValue(int i);
}

public class AboutLambdaExpression{
    public static void main(String[] args) {
        B b = (int val)->{
            System.out.println("Number entered : "+val);
            System.out.println("Doubled value is " +val*val);
        };
        b.doubleTheValue(5);
    }
}

Output:
Number entered : 5
Doubled value is 25
```

- Since we are using **one argument**, we can reduce the above implementation to below

```
        B b = val->{
            System.out.println("Number entered : "+val);
            System.out.println("Doubled value is " +val*val);
        };
        b.doubleTheValue(5);

Output:
Number entered : 5
Doubled value is 25
```

- Lambda expression not only makes your code concise and readable but also decrease your file size by eliminating **Anonymous class**. How but? when we compile a class which has anonymous class, check the size.

![alt text](image-1.png)

![alt text](image-2.png)

- When we use lambda expression.

![alt text](image-3.png)

![alt text](image-4.png)

- See the difference in size.
- If your functional interface have a method which returns something then in that case how to implement lambda expression?

```
@FunctionalInterface
interface Addition{
    int add(int n1,int n2);
}

public class AboutLambdaExpression{
    public static void main(String[] args) {
        Addition addvalues = (int i,int j) -> {
            return i+j;
        };
        System.out.println(addvalues.add(6, 5));
    }
}

Output:
11
```

- You can reduce the above code to below

```
        Addition addvalues = (int i,int j) ->  i+j;
        System.out.println(addvalues.add(6, 5));

Output:
11
```

- After `->` you don't need to add `return` keyword, the lambda expression handle that by itself.
- Lambda expression can only be used with functional interface because it only consist of one abstract method. Incase of multiple abstract methods it won't work because the statements of the lambda expression will wont't able to distinguish for which abstract method the implementation is written.



## Reflection



## Serialization & Deserialization

- Imagine you are playing one of the popular game **BGMI (PUB-G)**. You choose one character based on gender and accordingly you pick up dressing style for your character. Now apart from that your character killing score, its stats, matches played etc.. all this details are store somewhere in your mobile app. So when you open again, those details are still present, it does not get vanished.
- Apart from that, when a player shoots another player, the shooting action by the player gets reflected on the screen of another player. This will only happen via network. So your shooting data is transmitted over the network which is been caught by the same app installed on another player mobile.
- In java, serialization and deserialization works similarly.
- **Serialization:** Java Serialization is a mechanism by which Java objects can be converted into a byte stream. This byte stream data can be saved to a file, sent over a network or stored in memory.
- **Deserialization:** Java Deserialization is a mechanism by which byte stream (0's and 1's) fetched over the network, memory or file can be converted back again to its original java objects.

![alt text](image.png)

- In java if a class implements **java.io.Serializable**, then those classes object can serialize and deserialize. Lets see an example.

```



```

- not all classes and object can be serialize, .ser is not always the extension.

https://www.javaguides.net/2018/06/guide-to-serialization-in-java.html
https://www.javatpoint.com/serialization-in-java
https://techvidvan.com/tutorials/serialization-in-java/
