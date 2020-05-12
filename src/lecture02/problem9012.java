package lecture02;

import java.util.Scanner;
import java.util.Stack;

public class problem9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        final Character valid = '(';
        char val;
        for (int i = 0; i<count; i++){
            String input = sc.next();
            String output = "";
            Stack<Character> st = new Stack<Character>();
            for(int j = 0; j<input.length(); j++){
                val = input.charAt(j);
                if(valid.equals(val)){
                    st.push(val);
                }else if(st.size() == 0 && !valid.equals(val)){
                    output = "NO";
                    break;
                }else {
                    st.pop();
                }
            }
            if(output.equals("")){
                output = st.size() == 0 ? "YES":"NO";
            }
            System.out.println(output);
        }
        sc.close();
    }
}
