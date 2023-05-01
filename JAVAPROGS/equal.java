import java .util.*;
public class equal {
    public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if((a == b) && (a == c))
{
    System.out.println("all are equal");

}
else if((a == b)||(a == c)){
    System.out.println("a is equal to c");

}
else{
    System.out.println("no is invalid");
}

    }
    
}
