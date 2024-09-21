package AccessModifiers;

class C extends B{

}

public class OtherClass {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}
