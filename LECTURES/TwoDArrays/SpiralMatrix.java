package LECTURES.TwoDArrays;
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int totalNoOfElements = n*m;
        int count = 0;

        while(count<totalNoOfElements){
            //left wall
            for(int i=minr,j=minc; i<=maxr && count<totalNoOfElements; i++){
                System.out.println(matrix[i][j]);
                count++;
            }
            minc++;

            //bottom wall
            for(int j=minc,i=maxr; j<=maxc && count<totalNoOfElements; j++){
                System.out.println(matrix[i][j]);
                count++;
            }
            maxr--;

            //right wall
            for(int i=maxr,j=maxc; i>=minr && count<totalNoOfElements; i--){
                System.out.println(matrix[i][j]);
                count++;
            }
            maxc--;

            //top wall
            for(int j=maxc,i=minr; j>=minc && count<totalNoOfElements; j--){
                System.out.println(matrix[i][j]);
                count++;
            }
            minr++;
        }sc.close();
    }
}
