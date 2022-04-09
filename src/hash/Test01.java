import java.util.*

class Main {	
	public char solution (int n, String str){
		char answer =' ';
		HashMap<Character, Integer> hm = new HashMap<>();
		for(char c : str.toCharArray()) hm.put(c, hm.getOrDefault(c, 0)+1);
		
		int max = Integer.MIN_VALUE;
		for(char c : hm.keySet()) {
			if(hm.get(c) > max) {
				max = hm.get(c);
				answer = c;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str = sc.nextLine();
		System.out.println(t.solution(n, str));
	}
}