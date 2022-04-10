import java.util.*;

class Main {	
	public int solution (String str1, String str2){
		int answer = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char x : str2.toCharArray()) hm.put(x, hm.getOrDefault(x, 0)+1);
		
		
		return answer;
	}

	public static void main(String[] args){
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(t.solution(str1, str2));
	}
}