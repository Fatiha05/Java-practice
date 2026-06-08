
import java.util.Scanner;


public class assignment7 {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        System.out.println("Do you love java ?");
        char ch = input.next().charAt(0);
        if(ch=='y' || ch=='Y'){
            System.out.print("You are a java lover.");
        }
        else if (ch=='n' || ch=='N'){
            System.out.print("you are not java lover. ");
        }
        else{
            System.out.print("wrong choose");
        }
    }
    
}
