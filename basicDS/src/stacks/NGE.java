import java.util.Stack;
import java.util.*;

//Find the next gretest element in an array
public class T
{
	public static void nextEle(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int next = -1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] < arr[j]){
					next = arr[j];
					break;
				}
			}
			System.out.print(next+" ");
		}
		System.out.println();
	}
	
	
	//using stack
	public static void nextEleStack(int[] arr)
	{
		Stack<Integer> stack = new Stack<Integer>();
		//push the first element into the stack
		stack.push(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			while(!stack.isEmpty() && stack.peek() < arr[i]){
				System.out.print(stack.peek()+"--------->"+arr[i]+'\t');
				stack.pop();
			}
			stack.push(arr[i]);
		}
		//if remaining elemets are found then 
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+"------->"+-1+'\t');
		}
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {11,13,21,3};
		nextEle(arr);
		//for(int j:arr){System.out.println(j);}
		nextEleStack(arr);
	
	}
}