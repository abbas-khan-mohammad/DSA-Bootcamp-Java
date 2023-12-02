package LECTURES.Recursion;

import java.util.HashSet;

public class PrintUniqueSubsequences {
    public static void printUniqueSubsequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        printUniqueSubsequences(str, idx+1, newString+currChar, set);
        //or not to be
        printUniqueSubsequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequences(str, 0, "", set);
    }
}
