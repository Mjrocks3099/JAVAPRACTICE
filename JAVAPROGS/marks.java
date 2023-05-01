import java.util.*;
public class marks {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int math = sc.nextInt();
    int science = sc.nextInt();
    int english = sc.nextInt();
    int sum = (math+science+english);
    int perentage = (sum*100/300);
    System.out.println("the sum is");
    System.out.println(sum);
    System.out.println("the percentage is");
    System.out.println(perentage);

    }

    
}
