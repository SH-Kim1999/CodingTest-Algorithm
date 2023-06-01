package org.example;

import java.util.Scanner;
import java.util.Stack;

class Main {
    static Stack<Integer> stack = new Stack<>();
    public int solution(String a) {
        for (char x : a.toCharArray()) {
            if (Character.isDigit(x)) {
                // 정수로 저장
                stack.push(x - 48);
            } else {
                calc(x, stack.pop(), stack.pop());
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String arr = kb.next();
        System.out.print(T.solution(arr));

    }

    public void calc(char x,int a,int b) {
        switch (x) {
            case '*':
                stack.push(b * a);
                break;
            case '/':
                stack.push(b / a);
                break;
            case '+':
                stack.push(b + a);
                break;
            case '-':
                stack.push(b - a);
                break;
            default:
        }

    }
}