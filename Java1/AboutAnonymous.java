class Unknown{
    public void show(){
        System.out.println("In display...");
    }
}
public class AboutAnonymous {
    public static void main(String[] args) {
        int i=0;
        new Unknown().show(); // Anonymous Object
    }
}
