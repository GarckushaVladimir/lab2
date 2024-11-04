package StringCompress;

import java.util.Stack;

public class StringCompress {
    public static String compress(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                stack.push(s.charAt(i-1));
                if (count >= 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        stack.push(c);
                    }
                }
                count = 1;
            }
        }

        stack.push(s.charAt(s.length() - 1));
        if (count >= 1) {
            String countStr = String.valueOf(count);
            for (char c : countStr.toCharArray()) {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aaabccccdd";
        System.out.println(compress(s));
    }
}
