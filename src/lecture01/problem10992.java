package lecture01;

import java.util.Scanner;

public class problem10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 + 1; k++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    if (k == 0) {
                        System.out.print("*");
                    } else if (k == i * 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
