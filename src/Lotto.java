
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Lotto {
    int countDay;
//    LocalDate d1 = LocalDate.now();
    public int lotto(LocalDate d1){
        
        
//       for(int MM = 8 ; MM < 13;MM++){
//        LocalDate dayFrist = LocalDate.of(2018, 8, 1);
//        LocalDate daySixteen = LocalDate.of(2018, MM, 16);
//        
//        System.out.println(dayFrist);countDay++;
//        System.out.println(daySixteen);countDay++;
//       }
//        System.out.println("Remaining lotto day is " +countDay);

               
         if(d1.isBefore(LocalDate.of(2018, Month.DECEMBER, 31))){
             
             String dd = d1.format(DateTimeFormatter.ofPattern("d"));
             if("1".equals(dd) || "16".equals(dd)){
             System.out.println(d1);
             countDay++;
             }
             d1= d1.plusDays(1);
             lotto(d1);
         }
         return countDay;
    }
    
}
