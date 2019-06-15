import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/22 18:02
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_BracketMatching {
    public static boolean isRight(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != '(') {
                    return false;
                }
            } else if (s.charAt(i) == '[') {
                stack.push('[');
            } else if (s.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != '[') {
                    return false;
                }
            } else if (s.charAt(i) == '{') {
                stack.push('{');
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != '{') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if (isRight(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
