class Test{

    public void display(){
        System.out.println("In Display Test");
    }
}

class MultipleTest extends Test{
    public void display(){
        System.out.println("In Display MultipleTest");
    }
}


public class AboutFinal {
    public static void main(String[] args) {
        final int i=1;
        final int j;
        j=1;
        System.out.println("i value : "+i);
    }
}
