class QuickSort
{
	public int partition(int[] arr,int l,int h)
	{
		int i= l;
		int j = h;
		int pivot = arr[l];
		while(i <j)
		{
			do
			{
			i++;
			}while(arr[i] >= pivot);
		
			do
			{
			j--;
			}while(arr[j] < pivot);
		
			if(i <j)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
	int t = arr[l];
	arr[l] = arr[j];
	arr[j] = t;
	
	return j;
	}	
	public void quicksort(int[] arr,int l,int h)
	{
		if(l<h){
		int j = partition(arr,l,h);
		quicksort(arr,l,j);
		quicksort(arr,j+1,h);
		}
	}
	public static void main(String[] args)
	{
		int arr[] ={12,11,10,3,4,1,2};
		QuickSort s = new QuickSort();
		s.quicksort(arr,0,arr.length-1);
		
	}
}