package ASSIGNMENTS.Arrays;

import java.util.Arrays;

public class BoatsToSavePeople {
    public static int boatsToSavePeople(int people[], int limit){
        int count = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        while(left <= right){
            if(people[left] + people[right] <= limit){
                count++;
                left++;
                right--;
            }else{
                count++;
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int people[] = {7,9,6,7,8,2,10,8};
        int limit = 14;
        System.out.println(boatsToSavePeople(people, limit));
    }
}
