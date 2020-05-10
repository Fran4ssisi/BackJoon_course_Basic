package lecture01;

import java.util.Scanner;

public class problem11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        String input = sc.next();
        int rs = 0;
        for(int i = 0; i<index; i++){
            rs += input.charAt(i) - '0';
        }
        System.out.println(rs);
    }
}
