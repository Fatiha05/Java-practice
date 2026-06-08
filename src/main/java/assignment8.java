
import java.util.Scanner;


public class assignment8 {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);   
 System.out.print("Have you completed your masters:");
 char ch = input.next().charAt(0);
 
 System.out.print("Are you fluent in english:");
 char eng = input.next().charAt(0);
 
 if((ch=='y' || ch=='Y') &&( eng == 'y'|| eng == 'Y')){
 System.out.println("You are eligible for job interview");
}
 else{
 System.out.println("sorry! You are not eligible for job interview");
}
    }
 
}
