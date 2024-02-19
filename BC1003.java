import java.util.*;
import java.io.IOException;
public class BC1003 {
   public static void main(String[]args)throws IOException{
    try (Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("SOMA = "+sum);
    }
    
   } 
}
