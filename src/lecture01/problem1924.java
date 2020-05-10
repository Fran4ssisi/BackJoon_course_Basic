package lecture01;

import java.util.Scanner;

public class problem1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        sc.close();

        int dayArray[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthArray[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDay = day;

        for(int i = 0; i<month-1; i++) {
            totalDay += dayArray[i];
        }
        System.out.println(monthArray[totalDay%7]);
    }
}
