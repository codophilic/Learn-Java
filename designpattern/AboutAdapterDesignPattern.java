
// Target
interface AppleCharger{
    void appleProductCharge();
}


// Client - The client that needs charging but expects an AppleCharger.
class Iphone{
    
    private AppleCharger applecharger;

    Iphone(AppleCharger appleCharger){
        this.applecharger=appleCharger;
    }

    public void iphonecharge() {
        applecharger.appleProductCharge();
    };
}

interface AndroidCharger{
    void androidProductCharge();
}


//Adaptee - The existing incompatible class (Android charger) that we want to use.
class USBC implements AndroidCharger{

    @Override
    public void androidProductCharge() {
        System.out.println("Charging Phone....");
    };    
}

//Adapter - The bridge that allows AndroidCharger to work as an AppleCharger.
class Adapter implements AppleCharger{

    AndroidCharger androidCharger;

    Adapter(AndroidCharger androidCharger){
        this.androidCharger=androidCharger;
    }

    @Override
    public  void appleProductCharge(){
        System.out.println("Charging via Adapter");
        androidCharger.androidProductCharge();
    }

}

public class AboutAdapterDesignPattern {
    public static void main(String[] args) {
        
        AppleCharger applecharger = new Adapter(new USBC());
        Iphone iphone = new Iphone(applecharger);
        iphone.iphonecharge();

    }
}
