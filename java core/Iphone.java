abstract class Iphone {
    abstract void facelock();

    abstract void camera();

    void display(){
        System.out.println("It has Display");
    }

    void storage(){
        System.out.println("It has Storage");
    }
    void getDetails(){
        camera();
        facelock();
        storage();
        display();
    }
}

class Iphone11 extends Iphone{

    void facelock(){
        System.out.println("It has 11th version Facelock");
    }

    void camera(){
        System.out.println("It has 11th version Camera");
    }
}

class Iphone12 extends Iphone{

    void facelock(){
        System.out.println("It has 12th version Facelock");
    }

    void camera(){
        System.out.println("It has 12th version Camera");
    }
}

class Main{
    public static void main(String[] args) {
        Iphone i11 = new Iphone11();
        i11.getDetails();
        i11 = new Iphone12();
        i11.getDetails();
    }
}