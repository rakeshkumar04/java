class Encapsulation {
    private int value;

    public int getter(){
        return value;
    }

    public void setter(int value){
        this.value=value;
    }
}

class Test{
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setter(5);
        
        System.out.println(e.getter());
    }
}