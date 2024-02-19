import java.util.*;
import java.io.IOException;
public class BC1011 {
    public static void main(String[]args) throws IOException{
        try(Scanner sc = new Scanner(System.in)){
            int r = sc.nextInt();
            double area = (double)(4*3.14159*r*r*r)/3;
            System.out.printf("VOLUME = %.3f\n",area);

        }
    }
    
}
