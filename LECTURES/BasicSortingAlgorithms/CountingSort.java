package LECTURES.BasicSortingAlgorithms;
import java.util.*;
public class CountingSort {
    public static void countingSort(int arr[], int min, int max){
        int range = max - min + 1;
        int frequency[] = new int[range];
        for(int i=0; i<arr.length; i++){
            int idx = arr[i] - min;
            frequency[idx]++;
        }
        for(int i=1; i<frequency.length; i++){
            frequency[i] = frequency[i] + frequency[i-1];
        }
        int[] ans = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            int val = arr[i];
            int pos = frequency[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            frequency[val - min]--;
        }
        for(int i=0; i<ans.length; i++){
            arr[i] = ans[i];
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }sc.close();  
        countingSort(arr, min, max);
        printArr(arr);
    }
}// 1,2,3,4,5,6,7,8,9
