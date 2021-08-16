import java.util.ArrayList;
import java.util.Scanner;

public class CompareTwoArrayListsCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	Scanner scan= new Scanner(System.in);
	
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	int n = scan.nextInt();
	System.out.println("list1");
	for(int i=0;i<n;i++)
	{
		list1.add(scan.nextInt());
	}
	System.out.println("List2");
	
	for(int i=0;i<n;i++)
	{
		list2.add(scan.nextInt());
	}
	
	ArrayList<String> list3 =new ArrayList<String>();
	for(Integer e: list1)
	{
		list3.add(list2.contains(e)? "yes" :"no");
		
	}
	System.out.println(list3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
