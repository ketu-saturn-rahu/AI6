// positive negative zero 
import java.util.*;

public class week4p3 {
    public static void main(String Args[])  {
    
        Scanner ip = new Scanner(System.in);
        
        int num = ip.nextInt();
        
        if (num >0) {
        
        System.out.println("Positive");
        
        }
        
        else if (num <0) {
        
        System.out.println("Negative");
        
        
        }
        
        else {
        
        System.out.println("Zero");
        
        }
    
    }
}