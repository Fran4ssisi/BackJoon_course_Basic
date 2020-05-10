package lecture01;

import java.util.Scanner;

public class problem2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n-1; i++){
            for(int k = 0; k < i+1; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < n*2-3-(i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
