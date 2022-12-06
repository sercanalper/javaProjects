/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.*;

public class MatriceTranpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the colomn number: ");
        int col = scan.nextInt();

        System.out.print("Please enter the row number: ");
        int row = scan.nextInt();

        int[][] matrice = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrice[i][j] = (int) (Math.random() * (10));
            }
        }
        System.out.println("The matrice is: ");
        for (int k = 0; k < row; k++) {
            for (int m = 0; m < col; m++) {
                System.out.print(matrice[k][m]);
            }
            System.out.println();
        }

        int[][] rotated = new int[col][row];
        rotated = rotateMatrix(matrice);

        System.out.println("The tranpose of the matrice: ");
        for (int k = 0; k < col; k++) {
            for (int m = 0; m < row; m++) {
                System.out.print(rotated[k][m]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrice) {
        int[][] rotated = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[0].length; j++) {
                rotated[i][j] = matrice[j][i];
            }
        }
        return rotated;
    }
}