package LECTURES.Recursion;

public class CalcPowerLogN {
    public static int calcPowerLogN(int x, int n){
        if(n==0){
            return 1;
        }if(x==0){
            return 0;
        }

        //if n is even
        if(n%2==0){
            return calcPowerLogN(x, n/2) * calcPowerLogN(x, n/2);
        }
        else{// n is odd
            return calcPowerLogN(x, n/2) * calcPowerLogN(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calcPowerLogN(x, n);
        System.out.println(ans);
    }
}