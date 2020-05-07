package lecture01;

import java.util.Scanner;
import java.util.ArrayList;

public class problem11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if(input == null || input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }
        sc.close();

        for (String input : inputs) System.out.println(input);
    }
}
