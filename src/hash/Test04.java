package hash;
import java.util.*;

class Main {	
	public int olution (String a , String b){
		int answer = 0;
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for(char x : b.toCharArray()) hm2.put(x, hm2.getOrDefault(x, 0)+1);
		int L = b.length()-1;
		for(int i = 0; i < L; i++) {
			hm1.put(a.charAt(i), hm1.getOrDefault(a.charAt(i), 0)+1);
		}
		int lt = 0;
		for(int rt=L; rt<a.length(); rt++) {
			hm1.put(a.charAt(rt), hm1.getOrDefault(a.charAt(rt), 0)+1);
			if(hm1.equals(hm2)) answer++;
			hm1.put(a.charAt(lt), hm1.get(a.charAt(lt))-1);
			if(hm1.get(a.charAt(lt)) == 0) hm1.remove(a.charAt(lt));
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		string b = sc.next();
		System.out.println(t.solution(a, b));
	}
}