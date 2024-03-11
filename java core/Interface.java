public interface Interface {
    void facelock();

    void camera();

    void getDetails();
}


class Demo implements Interface{

    public void camera(){
        System.out.println("Camera");
    }

    public void facelock(){
        System.out.println("Facelock");
    }

    public void getDetails(){
        camera();
        facelock();
    }

    public static void main(String[] args) {
        Interface i = new Demo();
        i.getDetails();
        
    }
}