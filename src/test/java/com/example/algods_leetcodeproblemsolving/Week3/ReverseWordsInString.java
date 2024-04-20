package com.example.algods_leetcodeproblemsolving.Week3;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        String [] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder ();
        for (int i = words.length -1; i >= 0 ; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }

        }
        return sb.toString().trim();
    }

    // Solution with stack
    /*
    public String reverseWords(String s) {
        Stack <String> stack = new Stack<>();
        for (String str: s.trim().split(" ")) {
            if (!str.isEmpty()) {
                stack.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        return sb.toString().trim();
    }

     */
}
