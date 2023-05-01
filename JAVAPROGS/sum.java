import java.util.Scanner;

 class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
	System.out.println("Enter the size in 2 D array of row and column: ");
	m = sc.nextInt();
	n = sc.nextInt();
        int arr[][] = new int[m][n];
 	int sum[] = new int[n] ;
        int a = 0;
        
        System.out.println("Enter numbers: "); 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){         
		a=0;
            for(int j=0; j<n; j++){
                a = a + arr[i][j];
            }
            System.out.print(a+" ");
        }
        for(int i=0; i<m; i++){       
            int temp = 0;
            for(int j=0; j<n; j++){
                temp = temp + arr[j][i];
            }
            sum[i] = temp;
        }
        for(int i=0; i<n; i++){    
            System.out.print(sum[i]+ " ");
        }
    }
}