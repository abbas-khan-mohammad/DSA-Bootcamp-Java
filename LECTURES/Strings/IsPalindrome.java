package LECTURES.Strings;

public class IsPalindrome {
    public static boolean isPalindrome(String s){
        for(int i=0; i<s.length(); i++){
            int n = s.length();
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
}
