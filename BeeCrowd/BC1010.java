import java.util.Scanner;
import java.io.IOException;
public class BC1010 {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            double c = sc.nextDouble();

            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            double c1 = sc.nextDouble();

            double x1 = b*c+b1*c1;
            System.out.printf("VALOR A PAGAR: R$ %.2f\n",x1);




        }
    }
    
}
