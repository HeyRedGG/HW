import java.time.*;
import java.time.temporal.ChronoUnit;

public class HeartBeat {
    
    public void heartbeat(){

        long totalDays = ChronoUnit.DAYS.between(LocalDate.of(1990, Month.JULY, 7), LocalDate.now());
        System.out.println("I live " +totalDays+" days.");
        System.out.println("My total heartbeat is " +80*24*60*totalDays +" times. ");
        
    }
       
}
