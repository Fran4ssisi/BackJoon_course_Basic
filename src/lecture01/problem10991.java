package lecture01;

import java.util.Scanner;

public class problem10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<i+1; k++){
                System.out.print("*");
                for(int l = 0; l<1; l++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
