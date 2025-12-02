import java.util.*;
public class week4p6{

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
        
        if(inputChr == 'A') {
        
            sp = price - (price * a);
            System.out.println(sp);
        }
            
        else if(inputChr == 'B') {
         
            sp = price - (price * b);
            System.out.println(sp);
        }
        
        else if (inputChr == 'C') {
        
            sp = price - (price * c);
            System.out.println(sp);    
        
        }
        
        else if (inputChr == 'D') {
        
            sp = price - (price * d);
            System.out.println(sp);    
        
            
        } 
        
        else {
        
            System.out.println("Invalid Category??");
            
        }
        
    }

}