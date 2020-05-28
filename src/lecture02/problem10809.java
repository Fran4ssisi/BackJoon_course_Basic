package lecture02;

import java.util.Scanner;

public class problem10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] position = new int[26];
        for (int i=0; i<26; i++) {
            position[i] = -1;
        }
        for (int i=0; i<s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (position[c] == -1) {
                position[c] = i;
            }
        }
        for (int i=0; i<26; i++) {
            System.out.print(position[i] + " ");
        }
        System.out.println();
    }
}
