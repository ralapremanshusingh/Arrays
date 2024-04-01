import java.util.Scanner;

public class PageOrderCopy {


    public static void page(int totalPageNum, int printPage) {

        int term = termPage(totalPageNum, printPage);

        int[] numArr = createNumArr(printPage, term);

        printPageNum(numArr, term);
    
    }

    public static void printPageNum(int[] numArr, int term) {

         for(int i = 1; i <= term; i++ ) {

            for( int j = 0; j < numArr.length; j++) {

                System.out.print(numArr[j] + ", ");
                numArr[j] += 2;

            }

            // System.out.println();
        }
    }

    public static int termPage(int totalPageNum, int printPage) {

        if(totalPageNum % printPage != 0) {

            int rem = totalPageNum % printPage;
            totalPageNum += printPage - rem;

        }

        int newTerm = totalPageNum / printPage;

        System.out.println("Total New Page is " + totalPageNum);

        return newTerm;
    }

    public static int[] createNumArr(int printPage, int term) {

        int[] newNumArr = new int[printPage];

        newNumArr[0] = 1;

        int newTerm = term * 2;

        switch (printPage) {

            case  18 : 
            
                        for(int j = 1; j < newNumArr.length/2; j++) {
                        
                            newNumArr[j] = newNumArr[j-1] + newTerm;

                        }
                        newNumArr[9] = newNumArr[2] +1;
                        newNumArr[10] = newNumArr[1] +1;
                        newNumArr[11] = newNumArr[0] +1;
                        newNumArr[12] = newNumArr[5] +1;
                        newNumArr[13] = newNumArr[4] +1;
                        newNumArr[14] = newNumArr[3] +1;
                        newNumArr[15] = newNumArr[8] +1;
                        newNumArr[16] = newNumArr[7] +1;
                        newNumArr[17] = newNumArr[6] +1;

                        break;
            case  16 : 
            
                        for(int j = 1; j < newNumArr.length/2; j++) {
                        
                            newNumArr[j] = newNumArr[j-1] + newTerm;

                        }
                        newNumArr[8] = newNumArr[3] +1;
                        newNumArr[9] = newNumArr[2] +1;
                        newNumArr[10] = newNumArr[1] +1;
                        newNumArr[11] = newNumArr[0] +1;
                        newNumArr[12] = newNumArr[7] +1;
                        newNumArr[13] = newNumArr[6] +1;
                        newNumArr[14] = newNumArr[5] +1;
                        newNumArr[15] = newNumArr[4] +1;

                        break;
            case  12 : 
            
                        for(int j = 1; j < newNumArr.length/2; j++) {
                        
                            newNumArr[j] = newNumArr[j-1] + newTerm;

                        }
                        newNumArr[6] = newNumArr[1] +1;
                        newNumArr[7] = newNumArr[0] +1;
                        newNumArr[8] = newNumArr[3] +1;
                        newNumArr[9] = newNumArr[2] +1;
                        newNumArr[10] = newNumArr[5] +1;
                        newNumArr[11] = newNumArr[4] +1;

                        break;
            case  8 : 
            
                        for(int j = 1; j < newNumArr.length/2; j++) {
                        
                            newNumArr[j] = newNumArr[j-1] + newTerm;

                        }
                        newNumArr[4] = newNumArr[1] +1;
                        newNumArr[5] = newNumArr[0] +1;
                        newNumArr[6] = newNumArr[3] +1;
                        newNumArr[7] = newNumArr[2] +1;

                        break;
            case  4 : 
            
                        for(int j = 1; j < newNumArr.length/2; j++) {
                        
                            newNumArr[j] = newNumArr[j-1] + newTerm;

                        }
                        newNumArr[2] = newNumArr[1] +1;
                        newNumArr[3] = newNumArr[0] +1;

                        break;
        }


        return newNumArr;

    }

    public static void start() {

        Scanner sc = new Scanner(System.in);

        boolean again = true;

        do{

            System.out.print("Print in a Page (4/8/12/16/18) : ");
            int printPage = sc.nextInt();

            if(printPage == 4 || printPage == 8 || printPage == 12 || printPage == 16 || printPage == 18 ) {
                
                System.out.print("Enter Your Total Page : ");
                int totalPageNum = sc.nextInt();

                page(totalPageNum, printPage);

                again = false;
                
            }

        } while(again);
    }
    
    
    public static void main(String args[]) {

        start();

    }
}