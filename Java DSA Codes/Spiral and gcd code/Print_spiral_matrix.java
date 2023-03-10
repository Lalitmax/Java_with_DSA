import java.text.CollationElementIterator;
import java.util.Scanner;

public class Print_spiral_matrix {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter row and col");

        // create array
        int tDArray[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };
        int row = tDArray.length;
        int col = tDArray[0].length;

        // 1 5 7 9 10 11
        // 6 10 12 13 20 21
        // 9 25 29 30 32 41
        // 5 55 59 63 68 70
        // 40 70 79 81 95 105

        int rowStart = 0;
        int colStart = 0;

        int rowEnd = row - 1;
        int colEnd = col - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // step 1
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(tDArray[rowStart][i] + " ");
            }
            rowStart++;

            // step 2
            for (int j = rowStart; j <= rowEnd; j++) {
                System.out.print(tDArray[j][colEnd] + " ");
            }
            colEnd--;

            // step 3
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(tDArray[rowEnd][i] + " ");
            }
            rowEnd--;

            // step 4
            for (int j = rowEnd; j >= rowStart; j--) {
                System.out.println(tDArray[j][colStart] + " ");
            }
            colStart++;

        }

    }
}
