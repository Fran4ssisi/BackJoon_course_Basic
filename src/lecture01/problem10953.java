package lecture01;

import java.util.Scanner;

public class problem10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String input = sc.next();
            String[] inputArr = input.split(",");
            int a = Integer.parseInt(inputArr[0]);
            int b = Integer.parseInt(inputArr[1]);

            System.out.println(a + b);
        }
    }
}
