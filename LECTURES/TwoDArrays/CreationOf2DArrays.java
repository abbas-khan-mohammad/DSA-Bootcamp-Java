package LECTURES.TwoDArrays;
import java.util.*;
public class CreationOf2DArrays {
    public static boolean search(int arr[][], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==target){
                    System.out.println("target found at index: "+"("+i+","+j+")"); 
                    return true;
                }
            }
        }System.out.println("index not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int target = 7;
        int n = arr.length, m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }search(arr, target);
        sc.close();
    }
}
