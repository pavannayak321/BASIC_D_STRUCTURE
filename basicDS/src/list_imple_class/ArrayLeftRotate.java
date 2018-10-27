package list_imple_class;

public class ArrayLeftRotate
{
	
	/*
	 * printing the array elements   applicable only for only one case 
	 */
	public static void printArray(int[] array)
	{
		for(int array1:array)
		{
			System.out.println(array1);
		}
	}
	
	public static void leftRotateByOne(int[] arra)
	{
		int len=arra.length;
		int temp=arra[0];
		for(int i=0;i<=len-2;i++)
		{
			arra[i]=arra[i+1];
		}
		arra[len-1]=temp;
		printArray(arra);
		 
		
	}

	public static void main(String[] args)
	{
		leftRotateByOne(new int[] {12,23,34,56,78,89,90,100});
		System.out.println("hello");

	}

}
