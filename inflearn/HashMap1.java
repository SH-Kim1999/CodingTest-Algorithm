package org.example;

import java.util.*;
class Main {
    public char solution(int n,String s){
      char answer= ' ';
      HashMap<Character,Integer> candi = new HashMap<>();
      for(char x : s.toCharArray()){
          candi.put(x,candi.getOrDefault(x,0)+1);
      }
      int max = Integer.MIN_VALUE;
      for(char x : candi.keySet()){
          if (candi.get(x)>max){
              max = candi.get(x);
              answer = x;
          }
      }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.next();

        System.out.print(T.solution(n,s));
    }
}