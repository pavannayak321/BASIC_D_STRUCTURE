class InsertionSort
{
	
	//Itetrative insertionsort
	void sortIter(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
	//insertion sort recursive
	public void recInsertionSort(int[] arr,int n)
	{
		if(n<=1){
			return;
		}
		recInsertionSort(arr,n-1);
		
		int key = arr[n];
		int j = n-1;
		
		while(j>=0 && arr[j] > key){
			arr[j+1] = arr[j];
			j = j-1;
		}
		arr[j+1] = key;
		
	}
	
	public static void main(String[] args)
	{
		InsertionSort sort = new InsertionSort();
		 int [] arr = {12,3,4,56,23,43,13,1};
		 sort.recInsertionSort(arr,arr.length-1);
		 
		for(int i=0;i<arr.length;i++){System.out.print(arr[i]+" ");}
		
	}
}