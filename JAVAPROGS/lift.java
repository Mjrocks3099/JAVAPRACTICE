
import java.util.*;
public class lift{
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

             switch (a){
                 case 0: System.out.println("lift have arrived press the button on which floor you want to go");
                 break;
                 case 1: System.out.println("lets go to first floor");
                 break;
                 case 2: System.out.println("lets go to second floor");
                 break;
                 case 3: System.out.println("lets go to third floor");
                 break;
                 case 4: System.out.println("lets go to forth floor");
                 break;
                 case 5: System.out.println("this is fifth floor");
                 break;
                 default: System.out.println("coming down it is invalid input");

             }
        }

                     
        }


    }
