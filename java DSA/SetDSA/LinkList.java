package SetDSA;
import java.util.*;

public class LinkList {
    public static void main(String[] args) {

        HashSet<String> set=new HashSet<String>();  
           set.add("HI");    
           set.add("Hello");    
           set.add("Welcome");   
           set.add("Welcome");  
           set.add("HI");  

           Iterator<String> i=set.iterator(); 

           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }   
    }
}
