
import java.util.*;

class Main {	
	public ArrayList<Integer> solution (int n, int m, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < m-1; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		for(int rt=m-1; rt < n; rt++) {
			hm.put(arr[rt], hm.getOrDefault(arr[rt], 0)+1);
			answer.add(hm.size());
			hm.put(arr[lt], hm.get(arr[lt])-1);
			if(hm.get(arr[lt]) == 0) hm.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args){
		Main t = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : t.solution(n, m, arr)) {
			System.out.println(x + " ");
		}
	}
}