package lecture01;

import java.util.Scanner;

public class problem11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;
        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Case #" + ++x + ": " + a + " + " + b + " = " + sum);
        }
    }
}
