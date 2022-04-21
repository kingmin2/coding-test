package programmers;

import java.util.*;

class Solution{
	
    public int solution(int[] numbers) {
        
    	Arrays.sort(numbers);
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < numbers.length; i++) {
        	int smaller = Math.min(numbers[i], numbers.length-i);
        	
        	if(smaller >= max) max = smaller;
        	else break;
        }
        
        return max;
    }
}