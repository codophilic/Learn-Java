import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

interface SAM{
    void show();
}


@Deprecated
class A{
    
    public void thisistheshowmethodwhichbelongstoaclass(){
        System.out.println("In A");
    }

}
class B extends A{

    @Override
    public void thisistheshowmethodwhichbelongstoaclass(){
        System.out.println("In B");
    }

    @Deprecated
    public void dontUse(){

    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyCustomAnnotation {
    String value() default "default value";
    int count() default 0;
}

@MyCustomAnnotation(value = "Hi",count = 2)
class useAnnotation{
    public void display(){
        System.out.println("Use Annotation Display");
    }
}


public class AboutAnnotations {
    
    public static void main(String[] args) {
        B b = new B();
        b.thisistheshowmethodwhichbelongstoaclass();
        b.dontUse();

        useAnnotation uA= new useAnnotation();
        uA.display();
        MyCustomAnnotation getvalue=uA.getClass().getAnnotation(MyCustomAnnotation.class);
        System.out.println(getvalue.count()+" "+getvalue.value());
    }

}
