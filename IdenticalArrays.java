import java.util.Scanner;

public class IdenticalArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two 3x3 arrays with 10 different numbers
        System.out.print("Enter list1 (10 numbers separated by a space): ");
        int[][] m1 = readArray(input, 3, 3);

        System.out.print("Enter list2 (10 numbers separated by a space): ");
        int[][] m2 = readArray(input, 3, 3);

        // Display whether the two arrays are identical
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        // Check if the two arrays have the same contents
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readArray(Scanner input, int rows, int cols) {
        // Read a 2D array from user input
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
}
