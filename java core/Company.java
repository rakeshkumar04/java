abstract  class Salary{
    int salary;
    int id;
    String name;
    String dept;
    int days;
    String compName;

    abstract int getSalary(int i);
    
    String getDept(){
         return getClass().getName();
    }

    static String companyName(){
        return "KCG";
    };
    
    abstract void getProfile();

}

class DepartmentStaff extends Salary{

    int getSalary(int days){
        salary = days * 1000;
        return salary;
    }

    

    
    DepartmentStaff(int id,String name,int days){
        super.id = id;
        super.name = name;
        dept = getDept();
        super.days=days;
        salary = getSalary(days);
        compName= companyName();
        getProfile();
    }

    void getProfile(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Company: "+compName);
        System.out.println("Department: "+dept);
        System.out.println("No.of Working Days: "+days);
        System.out.println("Salary: "+salary);
    }
    
}


class NonTechnical extends Salary{
    int getSalary(int days){
        salary = days * 1000;
        return salary;
    }

    
    NonTechnical(int id,String name,int days){
        super.id = id;
        super.name = name;
        dept = getDept();
        super.days=days;
        salary = getSalary(days);
        compName= companyName();
        getProfile();
    }

    void getProfile(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Company: "+compName);
        System.out.println("Department: "+dept);
        System.out.println("No.of Working Days: "+days);
        System.out.println("Salary: "+salary);
    }
}

class Office extends Salary{
    int getSalary(int days){
        salary = days * 1000;
        return salary;
    }

    
    Office(int id,String name,int days){
        super.id = id;
        super.name = name;
        dept = getDept();
        super.days=days;
        salary = getSalary(days);
        compName= companyName();
        getProfile();
    }

    void getProfile(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Company: "+compName);
        System.out.println("Department: "+dept);
        System.out.println("No.of Working Days: "+days);
        System.out.println("Salary: "+salary);
    }
}

class StoreManager extends Salary{
    int getSalary(int days){
        salary = days * 1000;
        return salary;
    }

    
    StoreManager(int id,String name,int days){
        super.id = id;
        super.name = name;
        dept = getDept();
        super.days=days;
        salary = getSalary(days);
        compName= companyName();
        
    }

    void getProfile(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Company: "+compName);
        System.out.println("Department: "+dept);
        System.out.println("No.of Working Days: "+days);
        System.out.println("Salary: "+salary);
    }
}

public class Company {
    
    public static void main(String[] args) {
        Salary s1 = new DepartmentStaff(1,"Vignesh",4);
        s1.getProfile();
        System.out.println(" ");
        Salary s2 = new NonTechnical(2,"Varun",30);
        s2.getProfile();
        System.out.println(" ");
        Salary s3 = new Office(3,"Zaid",27);
        s3.getProfile();
        System.out.println(" ");
        Salary s4 = new StoreManager(4,"Tharun", 19);
        s4.getProfile();
    }
}
