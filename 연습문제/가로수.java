import java.io.*;
class Main {
	

	public double solution(int l, int[] a) {
		double d = 0;
		int max = 0;
		if (a[0]-0 < l-a[a.length-1]){
			max = l-a[a.length-1];
			d = max;
		}else{
			max = a[0]-0;
			d = max;
		}
		int maxArr = 0;
		for (int i=0; i<a.length-1; i++){
			if(maxArr<a[i+1]-a[i]){
				maxArr = a[i+1]-a[i];
			}
		}
		
		if (max<maxArr){
			d = maxArr;
		} else {
			d = max;
		}
		return d;
	}
	
	
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		
		int l = 10;
		int[] a = {2, 5};
		
		double result = main.solution(l, a);
		
		System.out.println(result);
	}
}
