import java.util.Scanner;

public class ArrayDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int arr[] = new int [n];
		
		for(int i =1;i<=n;i++)
		{
			arr[i] = scan.nextInt();
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
		for(int i=n;i>=1;i--)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
	}

}
