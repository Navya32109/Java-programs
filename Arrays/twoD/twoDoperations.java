package Arrays.twoD;

public class twoDoperations {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        // Print all elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // Sum of all elements
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // Sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }
        // Sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < a[0].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < a.length; i++) {
                columnSum += a[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }
    }
}