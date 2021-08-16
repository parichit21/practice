import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n ;
		int pos;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int [] arr = new int [n] ;
		
		System.out.println("position for left rotation ");
		pos = scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			 arr[(i+n-pos)%n] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
