import java.util.Scanner;

public class PreSumApproBru {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Number of Row : ");
        int r=sc.nextInt();
        System.out.println("Enter the Column : ");
        int c=sc.nextInt();
        int[][] arr = new int [r][c];
        System.out.println("Enter Value : ");
        // take input from user
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++)
                arr[i][j]=sc.nextInt();
            System.out.println();
        }

        System.out.println("Enter Number of Row : ");
        int r1=sc.nextInt();
        System.out.println("Enter the Column : ");
        int c1=sc.nextInt();
        System.out.println("Enter Number of Row : ");
        int r2=sc.nextInt();
        System.out.println("Enter the Column : ");
        int c2=sc.nextInt();
        
        int sum = 0;

        for(int i=r1; i<=r2; i++)
            for(int j=c1; j<=c2; j++)
                sum+=arr[i][j];
        
        System.out.println("Total Sum is : " + sum);

        sc.close();

        
    }
}
