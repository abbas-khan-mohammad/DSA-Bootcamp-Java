package LECTURES.TwoDArrays;

public class DiagonalSum {
    public static int diagonalSum(int mat[][]){
        int sum = 0;
        for(int i=0; i<=mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(i == j){
                    sum += mat[i][j];
                }else if(i+j==mat.length-1){
                    sum += mat[i][j];
                }
            }
        }return sum;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1,}};
                       System.out.println(diagonalSum(mat));
    }
}
