package assignment7;

import java.util.Stack;

public class reverseString {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("   World    Hello    "));
	}
	
	public static String reverseWords(String s) {
        Stack<String> ss = new Stack<>();
        int i = 0;
        // get rid of leading spaces
        while (s.charAt(i) == ' ' && i < s.length()) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0) {
                    ss.push(sb.toString());
                    sb = new StringBuilder();
                }
            }
            i++;
        }
        if (sb.length() > 0) {
            ss.add(sb.toString());
            sb = new StringBuilder();
        }
        while (!ss.isEmpty()) {
            sb.append(ss.pop());
            if (ss.size() >= 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
