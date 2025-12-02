import java.util.*;
public class week4p7 {
    public static void main(String Args[]) {
        
        Scanner ip = new Scanner(System.in);
        System.out.println("enter the price of the item");
        float price = ip.nextFloat();
        System.out.println("Enter the category");
        char inputChr = ip.next().charAt(0);
        float a = 0.6f;
        float b = 0.4f;
        float c = 0.2f;
        float d = 0.1f;
        float sp;        
        float dp = 0.0f;
        
        switch (inputChr) {
        
            case 'A':
                dp = a;
                break;
                
            case 'B':
                dp = b;
                break;
            
            case 'C':
                
                dp = c;
                break;
                
            case 'D':
                
                dp = d;
                break;
                
            default:
                
                break;
                
        }    
        
        sp = price - (price * dp);
        System.out.println(sp);
        
        
 }
}