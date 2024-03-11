package ArrayListDSA;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {

        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ls.add(i);
        }

        System.out.println("Before Rotation: "+ls);
 
        Instant startTime = Instant.now();
        

        //normal logic
        for(int i=0;i<3;i++){
            int temp=ls.get(ls.size()-1);
            ls.remove(ls.size()-1);
            ls.addFirst(temp);
        }

        
        Instant endTime = Instant.now();

        System.out.println("After Rotation: "+ls);

        Duration duration = Duration.between(startTime, endTime);
        long timeTaken = duration.toMillis();

        System.out.println("Duration: " + timeTaken + " milli-seconds");
    }
}
