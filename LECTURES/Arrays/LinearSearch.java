package LECTURES.Arrays;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9,10,11,8,6,32,63};
        int key = 32;
        int index = linearSearch(arr, key);
        if(index == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found at index: "+index);
        }
    }
}
