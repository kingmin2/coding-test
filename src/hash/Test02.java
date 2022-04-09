import java.util.*;

class Main {	
	public String solution (String str1, String str2){
		String answer ="YES";
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : str1.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		for(char c : str2.toCharArray()) {
			if(!hm.containsKey(c) || hm.get(c) == 0) return "NO";
			hm.put(c, hm.get(c)-1);
			
		}
		
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