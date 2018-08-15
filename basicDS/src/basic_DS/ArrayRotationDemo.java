package basic_DS;


import java.util.Scanner;
public class ArrayRotationDemo
{
	/*
	 * rotate function implementation
	 */
	public static void rotate(int[] array,int n,int d)
	{
		
		int[] newentry=new int[array.length+d];
		for(int i=0;i<array.length;i++)
		{
			newentry[i]=array[i];
			
		}
		/*
		 * including the extra length in array
		 */
		
		for(int i=0;i<d;i++)
		{
			
			newentry[newentry.length-d+i]=array[i];
			 
		}
		for(int u:newentry)
		{
			System.out.println(u);
		}
	}
	
	/*
	 * user inputs:::
	 */
	public static  void getDetails()
	{
		System.out.println("please enter no of Entries to be  Add:");
		Scanner sc = new Scanner(System.in);
			int len=sc.nextInt();
			int[] ele =new int[len];
			/*
			 * taking input of each value from the user
			 */
			for(int i=0;i<len;i++)
			{
				System.out.println("please enter value"+i);
				ele[i]=sc.nextInt();
				if(i==ele.length-1)
				{
					System.out.println("thanks for entering value:!!");
				}
			}
			/*
			 * taking the choice the no of rotated elements 
			 */
			System.out.println("please enter no: to be rotated");
			int rotate=sc.nextInt();
			rotate(ele,len,rotate);
			
	}

	public static void main(String[] args)
	{
		ArrayRotationDemo.getDetails();

	}

}
