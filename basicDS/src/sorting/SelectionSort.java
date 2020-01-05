class SelectionSort
{

	//Selection sort Algorithm---->O(n2)
	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int min_index = i;
			for(int j=i+1;j<n;j++){
				if(arr[min_index] > arr[j]){
					min_index = j;
				}
			}
			//swap 
		int tmp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = tmp;	
		}
	}
	
	
	//find min index value
	public static int minindex(int[] arr,int index ,int n)
	{
		if(index==n){
			return index;
		}
		
		int m = minindex(arr,index+1,n);
		return arr[index] < arr[m]?index:m;
	}
		
		
	
	//Recursive selection Sort
	public  static int[] recursiveSelection(int[] arr,int index,int n)
	{
		if(index==n){
			return arr;
		}
		/*
		find the min value from the arra
		*/
		int j = minindex(arr,index,n);
		
		/*swapping case
		*/
		if(arr[index] > arr[j]){
		int tmp = arr[index];
		arr[index] = arr[j];
		arr[j] = tmp;
		}
		//Recursively calling SelectiionSort
		recursiveSelection(arr,index+1,n);
		
	return arr;		
	}
	
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
		
	

	public static void main(String[] args)
	{
		int arr[] = {12,334,55,32,3,2,1,5,6};
		int[] t = recursiveSelection(arr,0,arr.length-1);
		for(int i=0;i<t.length;i++){System.out.println(t[i]);}
		
	}
}