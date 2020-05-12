package lecture02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            left.push(s.charAt(i));
        }
        int m = Integer.parseInt(br.readLine());
        while(m-- > 0) {
            String[] line = br.readLine().split(" ");
            char what = line[0].charAt(0);
            if (what == 'L') {
                if(!left.empty()){
                    right.push(left.pop());
                }
            } else if(what == 'D') {
                if(!right.empty()){
                    left.push(right.pop());
                }
            } else if(what == 'P'){
                char c = line[1].charAt(0);
                left.push(c);
            } else if(what == 'B'){
                if(!left.empty()) {
                    left.pop();
                }
            }
        }
        while(!left.empty()){
            right.push(left.pop());
        }
        StringBuffer sb = new StringBuffer();
        while (!right.empty()){
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
