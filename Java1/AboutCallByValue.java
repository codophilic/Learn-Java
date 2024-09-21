class Test{
    int i;
}


public class AboutCallByValue {

    public void modifyValue(int n1){
        n1=100;
    }

    public void ModifyTesti(Test inputobj){
        inputobj.i=99;
    }

    public static void main(String[] args) {
        int n1=10;
        AboutCallByValue obj = new AboutCallByValue();
        obj.modifyValue(n1);
        System.out.println(n1);

        Test t = new Test();
        t.i=10;
        obj.ModifyTesti(t);

        System.out.println(t.i);
    }
}
