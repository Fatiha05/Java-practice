
import java.util.Scanner;


public class assignment9 {
  public static void main(String[] args){
       System.out.println("language : "+"\n"+"1.bangla"+"\n"+"2.hindi"+"\n"+"3.urdu"+"\n"+"english");
      Scanner input = new Scanner(System.in);
      System.out.print("choose any option:");
      int num = input.nextInt();
      switch(num){
          case 1:
              System.out.print("Selected languague is bangla ");
              break;
          case 2:
              System.out.print("Selected languague is hindi ");
              break;
           case 3:
              System.out.print("Selected languague is urdu");
              break;
           default :
               System.out.print("English");
         
      
  }
  
}
}
