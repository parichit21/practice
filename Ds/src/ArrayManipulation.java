import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		
		//for index 0 as dummy
		long[] numbers = new long[N+1];
		
		for(int i = 0; i < M; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			
			numbers[a] += k;
			if(b + 1 <= N){
				numbers[b+1] -= k;
			}
		}
		
		long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i = 1; i < numbers.length; i++){
			sum = sum + numbers[i];
			if(sum > max){
				max = sum;
			}
		}
		
		System.out.println(max);
	
	}

}
