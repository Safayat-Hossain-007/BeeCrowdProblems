import java.util.*;
import java.io.IOException;
public class BC1007 {
    public static void main(String[]args) throws IOException{
        try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int diff = (a*b-c*d);
        System.out.println("DIFERENCA = "+diff);
        }
    }
}
