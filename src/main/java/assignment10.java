
import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter last number :");
        int n = input.nextInt();
        int i,sum=0;
        for(i =1; i<=n;i++){
           sum = sum+i;
        }
        System.out.print("Sum is "+sum);
    }
            
}
