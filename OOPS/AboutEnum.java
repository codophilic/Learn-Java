enum WorkingDays{
    Monday,Tuesday,Wednesday,Thursday,Friday;
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
    }
}