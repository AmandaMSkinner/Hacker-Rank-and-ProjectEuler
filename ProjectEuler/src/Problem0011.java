import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem0011 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for (int grid_i = 0; grid_i < 20; grid_i++) {
            for (int grid_j = 0; grid_j < 20; grid_j++) {
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        //Row Check
        long maxProduct = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 17; j++) {
                int chkRow = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
                if (chkRow > maxProduct) {
                    maxProduct = chkRow;
                }
            }
        }
        System.out.println("The horizontal max product is " + maxProduct);
        //Column Check
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 20; j++) {
                int chkCol = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
                if (chkCol > maxProduct) {
                    maxProduct = chkCol;
                }
            }
        }
        System.out.println("The vertical max product is " + maxProduct);
        //Rdiag Check
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                int chkRig = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
                if (chkRig > maxProduct) {
                    maxProduct = chkRig;
                }
            }
        }
        System.out.println("The right diagonal max product is " + maxProduct);
    }
}