class BubbleSort
{
	
	public static void bubbleSortIter(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =tmp;
				}
			}
		}
	}
		
		//Recursive Bubble sort
		/*
		Idea--->sort the first element position and then recur for the next elements
		*/
		
		public static int[]  recurBubble(int[] arr,int n)
		{
			if(n==1){
				return arr ;
			}
			for(int i=0;i<n-1;i++){
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
			recurBubble(arr,n-1);
		return arr;
		}
	
	public static void main(String[] args)
	{
		int[] arr={12,1,3,4,5,6,75,4,3,5};
		int[] r = recurBubble(arr,arr.length);
		for(int i=0;i<r.length;i++){System.out.print(arr[i]+" "+'\t');}
		
	}
}
		