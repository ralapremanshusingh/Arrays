public class ReversalArray {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int l=arr.length;

        for(int i=0; i<l/2; i++) {
            arr[i]=arr[i]+arr[l-i-1];
            arr[l-i-1]=arr[i]-arr[l-i-1];
            arr[i]=arr[i]-arr[l-i-1];
        }

        System.out.print("Reversal Array : ");

        for(int i: arr)
            System.out.print(i + " ");
           
    }
}
