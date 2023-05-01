import java.util.*;
public class lift {
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
   
    System.out.println(" Welcome to LPU Enter the number of floor where you want to go");
    int a = sc.nextInt();

    switch(a){
        case 91:System.out.println("india");
        break;
        case 92:System.out.println("We will proceed to level 2");
        break;
        case 93:System.out.println("We will proceed to level 3");
        break;
        case 94:System.out.println("We will proceed to level 4");
        break;
        case 15:System.out.println("We will proceed to level 5");
        break;
        case 16:System.out.println("We will proceed to level 6");
        break;
        case 17:System.out.println("We will proceed to level 7");
        break;
        case 18:System.out.println("We will proceed to level 8");
        break;
        case 29:System.out.println("We will proceed to level 9");
        break;
        default: System.out.println("There is no floor in this building");

    }
}
    
}
