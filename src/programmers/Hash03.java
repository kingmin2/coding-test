package programmers;
//위장
import java.util.*;
public class Hash03 {
	public static void main(String[] args) {
		
		String str = "서울 특별시";
		System.out.println(str.startsWith("서울"));
		System.out.println(str.startsWith("경기도"));
	}
	
	class Solution {
	    public int solution(String[][] clothes) {
	        int answer = 1;
	    
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        for(int i = 0; i < clothes.length; i++) {
	        	hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
	        }
	        
	        Iterator<Integer> it = hm.values().iterator();
	        while(it.hasNext()) {
	        	answer *= it.next().intValue()+1;
	        }
	        
	        return answer-1;
	    }
	}
	
	 
}