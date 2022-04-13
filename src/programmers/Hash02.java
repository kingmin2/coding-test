package programmers;
//전화번호목록 
import java.util.*;
public class Hash02 {
	public static void main(String[] args) {
		
		String str = "서울 특별시";
		System.out.println(str.startsWith("서울"));
		System.out.println(str.startsWith("경기도"));
	}
	
	class Solution {
		public boolean solution(String[] phone_book) {
			boolean answer = true;
	        
	        // phone_book sorting 하기
	        Arrays.sort(phone_book);
	        
	        //2. 1중 loop를 돌며 앞 번호가 뒷 번호의 접두어인지 확인
	        for(int i = 0; i < phone_book.length-1; i++) {
	        	if(phone_book[i+1].startsWith(phone_book[i]))
	        		return false;
	        }
	        
	        //String.startsWith의 인자값이 prefix로 시작되는지 알아보는 메소드
	        return answer;
    	}
	}
	
	class Solution2 {
		public boolean solution(String[] phone_book) {
			boolean answer = true;
	        
	        HashMap<String, Integer> hm = new HashMap<String, Integer>();
	        for(String str : phone_book) {
	        	hm.put(str, hm.getOrDefault(str, 0)+1);
	        }
	        
	       for(String str : hm.keySet()) {
	    	   for(int i = 1; i < str.length(); i++) {
	    		   if(hm.containsKey(str.substring(0, i))) return false;
	    	   }
	       }
	        
	        return answer;
    	}
	}
}