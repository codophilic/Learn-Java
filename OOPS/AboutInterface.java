interface AllTest{

    long totalMarks=100;

    void test1();
    void test2();
    void test3();
}

abstract class MoreTestCases implements AllTest{

    public abstract void test4();
    public abstract void test5();
    public abstract void test6();
}

interface ManyTestCases extends AllTest{

    void test4();
    void test5();
    void test6();
    
}

class EnglishTest implements AllTest{

    @Override
    public void test1() {
        System.out.println("English Test1");
    }

    @Override
    public void test2() {
        System.out.println("English Test2");
    }

    @Override
    public void test3() {
        System.out.println("English Test3");
    }
    
}

class MathsTest implements ManyTestCases{

    @Override
    public void test4() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void test5() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void test6() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void test1() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void test2() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void test3() {
        // TODO Auto-generated method stub
        
    }
    
}

interface Computer{
    void development();
}

class Laptop implements Computer{

    @Override
    public void development() {
        System.out.println("Using Laptop");
    }

}

class Desktop implements Computer{

    @Override
    public void development() {
        System.out.println("Using Desktop");
    }
}

class TouchBasedComp implements Computer{

    @Override
    public void development() {
        System.out.println("Using TouchBasedComp");
    }
}

class Developer{

    public void development(Laptop device){
        System.out.println("Developer performing development");
    }

    public void development(Desktop device){
        System.out.println("Developer performing development");
    }

    public void development(Computer com){
        com.development();
    }
}

interface first{
    void display();
}

interface second{
    void show();
}

class third implements first,second{

    @Override
    public void display() {

    }

    @Override
    public void show() {
        
    }
    
}

public class AboutInterface{
    public static void main(String[] args) {

        /**
         * Cannot create object of interface
         */
        //AllTest at= new AllTest();

        EnglishTest et= new EnglishTest();
        et.test1();
        System.out.println(AllTest.totalMarks); // Variables are static, so we can directly access it using interface name

        // AllTest.totalMarks=100; // Cannot update final variable

        Laptop lap = new Laptop();
        Developer dev= new Developer();


        Desktop dk= new Desktop();
        dev.development(dk); // Error because dk is type of Desktop and Laptop


        Developer dev1 = new Developer();
        /**
         * Developer Got Laptop
         */
        Computer com=new Laptop();
        dev1.development(com);

        /**
         * Developer Got Desktop
         */
        com=new Desktop();
        dev1.development(com);

        /**
         * Developer Got TouchBasedComp
         */
        com= new TouchBasedComp();
        dev1.development(com);

        Computer com1= new Computer() {

            @Override
            public void development() {
                System.out.println("One-Time Purpose Only");
            }
        
        };
        com1.development();
    }
}