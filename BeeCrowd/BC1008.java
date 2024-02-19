import java.util.*;
import java.io.IOException;
public class BC1008 {
    public static void main(String[]args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int empNum = sc.nextInt();
        int workedHour = sc.nextInt();
        double sal= sc.nextDouble();
        double tSal = workedHour*sal;
        System.out.println("NUMBER = "+empNum);
        System.out.printf("SALARY = U$ %.2f\n",tSal); 

    }
}
