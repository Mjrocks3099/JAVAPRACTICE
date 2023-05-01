import java.util.Scanner;

 class Sum {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int a,c;
	System.out.println("Enter the size in 2 D array of row and column:");
	a = ar.nextInt();
	c = ar.nextInt();
        int arr[][] = new int[a][c];
 	int sum[] = new int[c] ;
        int b = 0;
   
        
        System.out.println("Enter numbers: "); 
        for(int i=0; i<a; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = ar.nextInt();
            }
        }
            for(int i=0; i<a; i++){       
            int temp = 0;
            for(int j=0; j<c; j++){
                temp = temp + arr[j][i];
            }
            sum[i] = temp;
        }
        for(int i=0; i<c; i++){    
            System.out.print(sum[i]+ " ");
        }

       for(int i=0; i<a; i++){         
		b=0;
            for(int j=0; j<c; j++){
                b= a + arr[i][j];
            }
            System.out.print(b+" ");
        }
        
    }
}