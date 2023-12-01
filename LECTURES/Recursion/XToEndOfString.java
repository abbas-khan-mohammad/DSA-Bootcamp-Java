package LECTURES.Recursion;

public class XToEndOfString {
    public static void xToEndOfString(String str, int idx, int count, String newString){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            xToEndOfString(str, idx+1, count, newString);
        }else{
            newString += currChar; //newString = newString + currChar
            xToEndOfString(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        xToEndOfString(str, 0, 0, "");
    }
}
