package lecture01;

import java.util.Scanner;

public class problem2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i = 0; i<n; i++){
            for(int j = 0; j < 2 * (n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
            for(int k = 0; k < i+1; k++){
                if(i==n-1){
                    break;
                }
                System.out.print(" ");
            }
        }
        for(int i = 0; i<n-1; i++){
            for(int k = 0; k<n-i-2; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i + 3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
