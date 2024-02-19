import java.util.*;
import java.io.IOException;
public class BC1009 {
   public static void main(String[]args) throws IOException{
    try (Scanner sc = new Scanner(System.in)) {
        String name = sc.nextLine();
        double fixedSalary = sc.nextDouble();
        double totalSale = sc.nextDouble();
        double totalSalary = fixedSalary+totalSale*0.15;
        System.out.printf("TOTAL = R$ %.2f\n",totalSalary);
    }
    
   } 
}
