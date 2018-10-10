import java.io.*;
import java.util.*;

public class CTCI_A1_7{

     public static void main(String []args){
        int n=4;
        int[][] mat = { {1,2,0,7} , {4,5,6,62} , {7,8,90,53} };
        displayMat(n, rotateMatrix(n, mat));
     }
     
     static int[][] rotateMatrix(int n, int mat[][]) {
         int i,j;
         int[][] rot = new int[n][n];
         
         for(i=0; i<n; i++) {
             for(j=0; j<n; j++) {
                 rot[i][j] = mat[n-j-1][i];
             }
         }
         
         return rot;
     }
     
     static void displayMat(int n, int mat[][]) {
         int i,j;
         for (i=0; i<n; i++) {
             for (j=0; j<n; j++) {
                 System.out.print(mat[i][j]+ " ");
             }
             System.out.print("\n");
         }
     }
}