import java.util.*;
public class month{
    public static void main (String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        int mon = sc.nextInt();

        switch (mon){
         case 1: System.out.println("january");
         break;
         case 2: System.out.println("feburary");
         break;
         case 3: System.out.println("march");
         break;
         case 4: System.out.println("april");
         break;
         case 5: System.out.println("may");
         break;
         case 6: System.out.println("june");
         break;
         case 7: System.out.println("july");
         break;
         case 8: System.out.println("august");
         break;
         case 9: System.out.println("september");
         break;
         case 10: System.out.println("octuber");
         break;
         case 11: System.out.println("november");
         break;
         case 12: System.out.println("december");
         break;
         default: System.out.println("not a month ");

        }
    }

   
    }
}



    
