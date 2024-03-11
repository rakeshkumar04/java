interface Android{
    int imei = 100;

     void display();
     void storage();
     void share();
     void security();
     void getInfo();
     void imei();
}

interface Ios{
    int appleId = 200;

     void display();
     void cloud();
     void share();
     void facelock();
     void appleId();
     void getInfo();
}

class OnePlus implements Android{

    
    public void display() {
        System.out.println("OnePlus has Android UI");
    }

    
    public void storage() {
        System.out.println("OnePlus has Android Storage");
    }

   
    public void share() {
        System.out.println("OnePluas has Nearby share");
    }

    
    public void security() {
        System.out.println("OnePlus has Android Fingerprint");
        
    }
    
    public void imei(){
        System.out.println("IMEI is "+imei);
    }

    public void getInfo() {
        display();
        share();
        security();
        storage();
        imei();
        System.out.println(" ");
    }

}

class S11 implements Ios{

    public void display() {
        System.out.println("S11 has Ios display");
    }

    public void cloud() {
        System.out.println("S11 has Apple Cloud");
    }

    
    public void share() {
        System.out.println("S11 has Apple share");
    }

    
    public void facelock() {
        System.out.println("S11 has Facelock");
    }
    
    public void appleId(){
        System.out.println("Apple Id is "+appleId);
    }

    public void getInfo() {
        share();
        facelock();
        cloud();
        display();
        appleId();
        System.out.println(" ");
    }
    
}



class Hybrid implements Android,Ios{

    public void facelock(){
        System.out.println("H1 has facelock");
    }

    public void security(){
        System.out.println("H1 has security");
    }

    public void storage() {
       System.out.println("H1 has Builtin Storage");
    }

    
    public void share() {
        System.out.println("H1 has Nearby share");
    }

    
    public void getInfo() {
        display();
        storage();
        security();
        cloud();
        share();
        facelock();
        imei();
        appleId();
        System.out.println(" ");
    }

    
    public void cloud() {
        System.out.println("H1 has cloud");
    }

    
    public void display() {
        System.out.println("H1 has Retina Display");
    }

    public void appleId() {
        System.out.println("Cloud Id is "+appleId);
    }

    public void imei() {
        System.out.println("IMEI is "+imei);
    }
}

public class InterfacePhone {
    public static void main(String[] args) {
        OnePlus op = new OnePlus();
        op.getInfo();
        
        S11 s11 = new S11();
        s11.getInfo();

        Hybrid h = new Hybrid();
        h.getInfo();
    }
}
