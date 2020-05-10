package lecture01;

import java.util.Scanner;

public class problem2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        for(int i=0; i<index;i++){
            System.out.println(index-i);
        }
    }
}