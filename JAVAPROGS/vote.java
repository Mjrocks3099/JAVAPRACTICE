import java.util.*;
public class vote {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

    
         if(age>18)
         {
            System.out.println("this person is eligible for vote");
         }
         else{
            System.out.println("you are not eligible to vote");
         }
     
}}
