package LECTURES.Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String hel, String des){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+des);
            return;
        }
        towerOfHanoi(n-1, src, des, hel);
        System.out.println("transfer disk "+n+" from "+src+" to "+des);
        towerOfHanoi(n-1, hel, src, des);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
