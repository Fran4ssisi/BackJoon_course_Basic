package lecture01;

import java.util.Scanner;

public class problem8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1; i<n+1; i++){
            sum = sum+i;
        }
        System.out.println(sum);
    }
}