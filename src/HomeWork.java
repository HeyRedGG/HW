
import java.time.LocalDate;




public class HomeWork {

    public static void main(String[] args) {
        int x;
        HeartBeat heart = new HeartBeat();
        Lotto reLot = new Lotto();
        Bonus bo = new Bonus();
        
        heart.heartbeat();
        System.out.println(" ");
        bo.bonus();
        System.out.println(" ");
        
        x = reLot.lotto(LocalDate.now());
        System.out.println("You still can buy lotto "+ x +" more time,before the year end.");
    }
    
}
