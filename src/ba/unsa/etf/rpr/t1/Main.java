package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //upis
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for(int i = 1; i <= n; i = i + 1) {
            if(i % sumaCifara(i) == 0) {
                //ispisi
                System.out.println(i);
            }
        }
    }

    public static int sumaCifara(int n) {
        int sumacifara = 0;
        while(n != 0) {
            sumacifara = sumacifara + (n%10);
            n = n / 10;
        }
        return sumacifara;
    }
}
