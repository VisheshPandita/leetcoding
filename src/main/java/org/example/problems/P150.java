package org.example.problems;

import java.util.Stack;

public class P150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                switch (token) {
                    case "+" -> {
                        int one = stack.pop();
                        int two = stack.pop();
                        stack.push(one + two);
                    }
                    case "-" -> {
                        int one = stack.pop();
                        int two = stack.pop();
                        stack.push(two - one);
                    }
                    case "*" -> {
                        int one = stack.pop();
                        int two = stack.pop();
                        stack.push(one * two);
                    }
                    case "/" -> {
                        int one = stack.pop();
                        int two = stack.pop();
                        stack.push(two / one);
                    }
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
