package ArrayListDSA;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class ArrayListTime {
    public static void main(String[] args) {

        Instant startTime = Instant.now();

        ArrayList<Integer> ls = new ArrayList<Integer>();
  
        for(int i=0;i<1000000000;i++){
            ls.add(i);
        }

        Instant endTime = Instant.now();

        Duration duration = Duration.between(startTime, endTime);
        long timeTaken = duration.toMillis();

        
        System.out.println("Duration: " + timeTaken + " milli-seconds");
        
    }
}
