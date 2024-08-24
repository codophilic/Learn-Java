
class Information{
     private int age;
     private String name;

     public void assignAge(int age){
        this.age=age;
     }
     public void assignName(String name){
        this.name=name;
     }
     public int fetchAge(){
        return age;
     }
     public String fetchName(){
        return name;
     }

}

public class Encapsulation{
    public static void main(String[] args) {
        Information inf=new Information();
        inf.assignAge(20);
        inf.assignName("Harsh");
        System.out.println(inf.fetchName()+", "+inf.fetchAge());
    }
}