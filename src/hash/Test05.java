import java.util.*;

class Main {	
	public int solution (int n, int m, int[] arr){
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int l = j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt == m)return x;
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
		 
		System.out.println(t.solution(n, m, arr));
	}
}