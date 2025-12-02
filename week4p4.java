import java.util.*;

public class week4p4 {


    public static void main(String Args[]) {
    
    
        Scanner ip = new Scanner(System.in);
        int x = ip.nextInt();
        
        if(x %3 ==0 && x%5 ==0) {
                
            System.out.println("Divisable by both");
        }
        else {
        
            System.out.println("Not divisable by both");
            
        }

    }
}
