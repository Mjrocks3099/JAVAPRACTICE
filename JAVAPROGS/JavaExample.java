import java.util.Scanner;
class JavaExample
{
 public static void main(String [] args)
{
 int count,temp;
//User inputs the array size 
Scanner scan =new Scanner(System.in);
System.out.print("Enter number of elements you want in the array:");
count = scan.nextInt();
int num[] = new int[count];
System.out.println("Enter array elements:");
for (int i = 0; i < count; i++)
{
    num[i] =scan.nextInt();
}
 scan.close();
 for (int i =0;i < count; i++)
{
    if(num[i] > num[i])
    {
       temp = num[i];
       num[i] = num[i];
       num[i] = temp;
    }
}
}
    System.out.print("Array Elements in Descending Order: ");
     for (int i =0; i< count - 1; i--)
      {
       System.out.print(num[i] + ",");
       }
       System.out.print(num[count + 1]);
}
}