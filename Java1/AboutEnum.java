enum WorkingDays{
    Monday,Tuesday,Wednesday,Thursday,Friday;
}

enum Laptop{
    MACBOOK(1000,"64GB"),HP(500,"32GB"),DELL(750,"32GB"),ASUS(600,"128GB"),NEWLAPTOP;

    private int price;

    private String ram;

    Laptop(){
        System.out.println("Default Constructor");
        this.price=0;
        this.ram="not defined";
    }

    Laptop(int price,String ram) {
        System.out.println("Parameterized Constructor");
        this.price=price;
        this.ram=ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}

public class AboutEnum{
    public static void main(String[] args) {
        
        WorkingDays wd=WorkingDays.Monday;
        System.out.println("Current working day is "+wd);

        WorkingDays[] getAllDays = WorkingDays.values();
        for(WorkingDays i: getAllDays){
            System.out.println(i);
        }

        /**
         * Each constant has a index in Enum , starting from 0
         */
        WorkingDays getFirstDay = WorkingDays.Monday;
        System.out.println("Index of Monday - "+getFirstDay.ordinal());

        Laptop lap=Laptop.MACBOOK;
        System.out.println("Laptop Price "+lap.getPrice());
        lap.setPrice(2000);
        System.out.println("Laptop Price "+lap.getPrice());
        System.out.println("Laptop RAM "+lap.getRam());
        
        Laptop newlap=Laptop.NEWLAPTOP;
        System.out.println("Laptop Price "+newlap.getPrice());
        System.out.println("Laptop RAM "+newlap.getRam());

    }
}