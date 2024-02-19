import java.util.*;
import java.io.IOException;
public class BC1004 {
   public static void main(String[]args) throws IOException{
    try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = a*b;
        System.out.println("PROD = "+pro);
    }
   } 
}
