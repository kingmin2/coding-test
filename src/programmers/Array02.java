package programmers;

import java.sql.ResultSet;
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] str = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
        	str[i] =  String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
        	
        	public int compare(String s1, String s2) {
        		 return ((s1 + s2).compareTo(s1 + s2));
        	}
        });
        
        if(str[0].equals("0")) {
        	return "0";
        }
        String answer = "";
        for(String a : str) {
        	answer += a;
        }
        
        return answer;
    }
}