package LECTURES.Backtracking;

public class BacktrackingOnArrays {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void backtrackingOnArrays(int arr[], int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion (Kaam)
        arr[i] = val;
        backtrackingOnArrays(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrackingOnArrays(arr, 0, 1);
        printArr(arr);
    }
}//hi
