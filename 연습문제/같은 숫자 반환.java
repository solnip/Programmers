
import java.util.*;
import java.io.*;

class Main {

	public int[] solution(int[] a, int[] b) {
		int[] c = {};
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++){
			for (int j=0; j<b.length; j++){
				if (a[i]==b[j]){
					b[j] = 0;
				  arr.add(a[i]);
					break;
				}	
			}
		}
		c = new int[arr.size()];
		for (int k=0; k<arr.size(); k++){
			c[k] = arr.get(k);
		}
		return c;
	}
	
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		int[] a = {1,2,2,3,3,3};
		int[] b = {2,3,3,4,5};
		int[] result = main.solution(a,b);
		
		System.out.println(Arrays.toString(result));
	}
}
