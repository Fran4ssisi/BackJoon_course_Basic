package lecture01;

import java.util.Scanner;

public class problem2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=n; i>0; i--){
            for(int j = 1; j<n+1; j++){
                if(i <= j){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
