package ArrayListDSA;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

class ArrayListMinMax{
    public static void main(String[] args) {
        
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(3);
        ls.add(5);
        ls.add(1);
        ls.add(7);
        ls.add(8);
        ls.add(9);
        ls.add(6);
        
        int min=ls.get(0);
        int max=ls.get(ls.size()-1);

        Instant startTime = Instant.now();

        for(int i : ls){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }

        Instant endTime = Instant.now();
        
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);

        Duration duration = Duration.between(startTime, endTime);
        long timeTaken = duration.toMillis();

        
        System.out.println("Duration: " + timeTaken + " milli-seconds");

    }
}