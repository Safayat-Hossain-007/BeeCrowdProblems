import java.util.*;
public class CF1635A {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int size,x=0;
    int t = sc.nextInt();
    for(int i=0;i<t;i++){
        size = sc.nextInt();
        int array[] = new int[size];
        for(int j = 0; j<size; j++){
           array[j]= sc.nextInt();
           x|= array[j];
        }
        System.out.println(x);
    }
    
   } 
}
