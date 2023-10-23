package LECTURES.Strings;

public class ConvertLettersToUppercase {
    public static String toUpperCase(String title){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(title.charAt(0));
        sb.append(ch);

        for(int i=1; i<title.length(); i++){
            if(title.charAt(i)==' ' && i<title.length()-1){
                sb.append(title.charAt(i));
                i++;
                sb.append(Character.toUpperCase(title.charAt(i)));
            }else{
                sb.append(title.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String title = "hi, i am abbas";
        System.out.println(toUpperCase(title));
    }
}
