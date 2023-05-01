import java.util.*;
public class elseif {

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

     if(a==b){
        System.out.println("a is equal to b");

    }
    else if(a>b){//elseif is used when we want to check either condition 1 or 2 if 1 is checked it is true then alse if will not be checked
            System.out.println("a is greater then b");
        }
        else{
            System.out.println("a is smaller then b");
        }
    }
}
    


    

