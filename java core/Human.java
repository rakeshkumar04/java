class Human{
    String name;
    int age;
    char gender;
    
    Human(String n, int a, char g){
        name = n;
        age = a;
        gender= g;
    }

    void brain(){
        if(gender=='G'){
            System.out.println(name+" is genius of age "+age);
        }
        else{
            System.out.println(name+" is genius of age "+age);
        }
    }

    public static void main(String[] args) {
        Human akash = new Human("Akash",17,'B');
        akash.brain();

        Human girl = new Human("Girl",19,'G');
        girl.brain();
    }
}