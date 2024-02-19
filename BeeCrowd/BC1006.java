import java.util.*;
import java.io.IOException;
public class BC1006 {
    public static void main(String[]args) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
           double a = sc.nextDouble();
           double b = sc.nextDouble();
           double c = sc.nextDouble();
           double m = ((a*2)+(b*3)+(c*5))/10;
           System.out.printf("MEDIA = %.1f\n",m);
           sc.close();    
        }
        
    }
    
}
