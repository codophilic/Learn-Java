
class Calculator{
    public void add(int... inputArray){
        int addition=0;
        for(int i: inputArray){
            addition+=i;
        }
        System.out.println("Sum is "+addition);
    }

    public void operation(String operationType,int anyNum,int... inputArray){
        int finalAns=anyNum;
        for(int i: inputArray){
            if(operationType.equalsIgnoreCase("add")){
                finalAns+=i;
            }
            else{
                finalAns-=i;
            }
        }

        System.out.println(operationType+" of given arrays is "+finalAns);

    }

}

public class AboutVarargs {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(5, 6,7,8,9,10);
        cal.add(5,7);
        cal.add();

        cal.operation("add",100, 5,6,7,8,9,10);
        cal.operation("subtract",100, 5,6,7,8,9,10);
    }
}
