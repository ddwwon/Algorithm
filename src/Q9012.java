package BOJ;

import java.util.*;


public class Q9012 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        int T = sc.nextInt();
        char ch = ' ';
        int cnt = 0;

        for(int i = 0; i < T; i++){
            String str = sc.next();
            for(int j = 0; j < str.length(); j++){
                ch = str.charAt(j);
                stack.push(ch);
                if(stack.push(ch) == '('){
                    cnt++;
                } else if(stack.push(ch) == ')'){
                    cnt--;
                }
                if(cnt < 0){
                    break;
                }
            }
            if(cnt == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
            cnt = 0;
        }
    }
}
