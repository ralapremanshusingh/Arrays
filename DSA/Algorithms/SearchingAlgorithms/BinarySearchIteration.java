
public class BinarySearchIteration {

   
    private static int binarySearchIteration(int[] element) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Key : ");
        int key = sc.nextInt();

        int n = element.length;
        int leftIndex = 0;
        int rightIndex = n - 1;
        int mid = 0;

        while (leftIndex <= rightIndex) {
            mid = (leftIndex + rightIndex) / 2;

            if (key == element[mid]) {
                return mid;
            } else if (key < element[mid]) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }

        }
        return -1;
    }
}
