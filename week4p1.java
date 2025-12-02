// program to determine student has passed or failed  
import java.util.*;
public class week4p1 {
    public static void main(String Args[])
    {
    
    Scanner ip = new Scanner(System.in);
    
    int marks = ip.nextInt();
    
    if (marks >=40 && marks <=100) {
    
        System.out.println("You are Pass");
    }
    
    else {
        System.out.println("Failed or invalid marks");
    
    }
    }
}