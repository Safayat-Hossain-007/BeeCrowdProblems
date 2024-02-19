import java.io.IOException;
import java.util.Scanner;
public class BC1005 {
 
    public static void main(String[] args) throws IOException {
 
        try(Scanner in = new Scanner(System.in)){
        double A = in.nextDouble();
        double B = in.nextDouble();
        double A_weight = 3.5;
        double B_weight = 7.5;

        double average = ((A*A_weight)+(B*B_weight))/(A_weight+B_weight);
        System.out.printf("MEDIA = %.5f\n",average);
        }
 
    }
 
}