
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public class Bonus {
    
    public void bonus(){
        
        long rDay = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2019, Month.FEBRUARY, 27));
        
        System.out.println("Remaining until next bonus day : "+ rDay);
        
    }
    
}
