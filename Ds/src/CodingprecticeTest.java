import java.lang.reflect.Array;
import java.util.Scanner;

public class CodingprecticeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	int n ;
	n = scan.nextInt();
	int[]  arr = new int [n];
	int k;
	for(int i=0;i<n;i++)
	{
		arr[i]=scan.nextInt();
	}
	k=scan.nextInt();
	for(int i=0;i<n;i++)
	{
		if(k==arr[i])
		{
			System.out.println("yes");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	}

}
