import java.util.*;
public class CF1879{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int testCase= sc.nextInt();
        int participant,strength,endurance,polyStrength=0,polyEndurance=0,weigth=0;
        for(int i =0;i<testCase;i++){
           participant = sc.nextInt();
           for(int j=0;j<participant;j++){
                strength= sc.nextInt();
                endurance= sc.nextInt();
                if(j == 0){
                    polyStrength=strength;
                    polyEndurance=endurance;
                    weigth= strength;

                }

                else{
                    if(polyStrength<=strength && polyEndurance<=endurance){
                        weigth=-1;

                    }
                }

           } 
           System.out.println(weigth);
        }
    }
}