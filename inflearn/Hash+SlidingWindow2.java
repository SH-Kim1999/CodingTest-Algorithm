package org.example;

import java.util.HashMap;
import java.util.Scanner;

class Main{
    public int solution(String a, String b){
        int answer=0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character,Integer> bm = new HashMap<>();
        for(char x :b.toCharArray()){
            bm.put(x,bm.getOrDefault(x,0)+1);
        }
        int len = b.length()-1;
        for(int i=0;i<len;i++){
            am.put(a.charAt(i),am.getOrDefault(a.charAt(i),0)+1);
        }
        int lt =0;
        for(int rt =len;rt<a.length();rt++){
            am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
            if (am.equals(bm)){
                answer++;
            }
            am.put(a.charAt(lt),am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0){
                am.remove(a.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String n = kb.next();
        String t = kb.next();
        System.out.print(T.solution(n,t));
    }
        }