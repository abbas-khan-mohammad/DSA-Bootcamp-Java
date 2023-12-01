package LECTURES.Recursion;

public class StringInReverse {
    public static void stringInReverse(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        stringInReverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        stringInReverse(str, str.length()-1);
    }
}
