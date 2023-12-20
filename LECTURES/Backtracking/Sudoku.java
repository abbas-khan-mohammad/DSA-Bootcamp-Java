package LECTURES.Backtracking;

public class Sudoku {
    public static boolean isSafe(int puzzle[][], int row, int col, int digit){
        //column
        for(int i=0; i<=8; i++){
            if(puzzle[i][col]==digit){
                return false;
            }
        }

        //row
        for(int j=0; j<=8; j++){
            if(puzzle[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(puzzle[i][j] == digit){
                    return false;
                }
            }
        }return true;
    }
    public static boolean sudoku(int puzzle[][], int row, int col){
        //base case
        if(row==9 && col==0){
            return true;
        }
        //recursion
        int nextRow = row, nextCol = col+1;
        if(col+1==9){
            nextRow = row+1;
            nextCol = 0;
        }

        if(puzzle[row][col] != 0){
            return sudoku(puzzle, nextRow, nextCol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(puzzle, row, col, digit)){
                puzzle[row][col] = digit;
                if(sudoku(puzzle, nextRow, nextCol)){
                    return true;
                }puzzle[row][col]=0;
            }
        }return false;
    }

    public static void printSudoku(int puzzle[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(puzzle[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        int puzzle[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                          {4, 9, 0, 1, 5, 7, 0, 0, 2},
                          {0, 0, 3, 0, 0, 4, 1, 9, 0},
                          {1, 8, 5, 0, 6, 0, 0, 2, 0},
                          {0, 0, 0, 0, 2, 0, 0, 6, 0},
                          {9, 6, 0, 4, 0, 5, 3, 0, 0},
                          {0, 3, 0, 0, 7, 2, 0, 0, 4},
                          {0, 4, 9, 0, 3, 0, 0, 5, 7},
                          {8, 2, 7, 0, 0, 9, 0, 1, 3}};

                          if(sudoku(puzzle, 0, 0)){
                            System.out.println("solution exists");
                            printSudoku(puzzle);
                          }else{
                            System.out.println("solution does not exists");
                          }
    }
}
