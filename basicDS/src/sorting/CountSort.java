
import java.util.*; 
class CountSort{
	public void countsort(int[] arr)
	{
		//Step-1 Build the Count array That Stores the count of each value in list
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		/* 
		step-2	Get the range and create array to store count of each val in count
		*/
		int range = max-min+1;
		int[] count = new int[range];
		for(int i=0;i<count.length;i++){
			count[arr[i]-min]++;				//----------------------------------DDDDDDDDDD--------------------
		}
		for(int i=1;i<count.length;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		int[] output = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int v = arr[i]-min;
			int v1 = count[v]-1;
			output[v1] = v;
			count[arr[i] - min]--;
		}
		
		for(int i=0;i<output.length;i++){System.out.print(output[i]+" ");}	
	}
	public static void main(String[] args)
	{
		CountSort s = new CountSort();
		int[] arr = {1,4,1,2,7,5,2};
		s.countsort(arr);
	}
}