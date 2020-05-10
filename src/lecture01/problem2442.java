package lecture01;

import java.util.Scanner;

public class problem2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int idx = 1;

        for(int i = 0; i<n; i++){
            for(int y =n-1; y>i; y--){
                System.out.print(" ");
            }
            for(int j = 0; j<idx; j++){
                System.out.print("*");
            }
            System.out.println();
            idx +=2;
        }
    }
}
