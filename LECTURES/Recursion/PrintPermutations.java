package LECTURES.Recursion;

public class PrintPermutations {
    public static void printPermutations(String str, String permutaion){
        if(str.length() == 0){
            System.out.println(permutaion);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, permutaion+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
