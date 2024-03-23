
public class LinearSearch {

    private static int linearSearch(int[] arr) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter Your Key : ");
            int key = sc.nextInt();
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                if (arr[i] == key)
                    return i;
            }
        }

        return -1;
    }


}
