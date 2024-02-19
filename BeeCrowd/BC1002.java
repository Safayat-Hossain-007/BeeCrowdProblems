import java.util.*;
import java.io.IOException;
public class BC1002 {
    public static void main(String[]args) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble();
            double a = 3.14159*x*x;
            System.out.println(String.format("A=%.4f",a));
        }

    }
    
}
