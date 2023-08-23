public class RotateArray {

    static void transpose(int[][] arr) {
        for(int i=0; i<arr.length; i++)
            for(int j=i;j<arr[i].length; j++) {
                if(i!=j) {
                arr[i][j]=arr[i][j]+arr[j][i];
                arr[j][i]=arr[i][j]-arr[j][i];
                arr[i][j]=arr[i][j]-arr[j][i];
                }
            }
    }
   
    static void reverse(int[][] arr) {
        for(int j=0; j<arr.length; j++) {
            int l=arr[j].length;
            for(int i=0; i<l/2; i++) {
                arr[j][i]=arr[j][i]+arr[j][l-i-1];
                arr[j][l-i-1]=arr[j][i]-arr[j][l-i-1];
                arr[j][i]=arr[j][i]-arr[j][l-i-1];
            } 
        }
    }

    public static void main(String[] args) {
      int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };

        transpose(arr); 
        reverse(arr);
        System.out.println("After Rotating Arrary : ");
        for(int[] i: arr) {
            for(int j:i) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
    
}
