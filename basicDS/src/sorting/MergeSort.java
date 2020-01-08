class MergeSort
{
	public void merge(int[] arr,int l,int m,int r)
	{
		//find the length of the two sub arrays
		int n1 = m-l+1;
		int n2 = r-m;
		
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		/*Copy the elements of the L--->m  and m---->h into tmp lists
		*/
		for(int i=0;i<n1;i++){
			L[i] = arr[l+i];
		}
		for(int j=0;j<n2;j++){
			R[j] = arr[m+1+j];
		}
	
		int i=0;
		int j=0;
		int k = l;
		while(i<n1 && j<n2)
		{
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k]  = R[j];
			j++;
			k++;
		}
	}
	/*
	divide the Entire Array Upto Individual Element
	*/
	public void sort(int[] arr,int l,int r)
	{
		if(l<r)
		{
			int m = l+r/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {12,5,2,3,4,14,11,10};
		MergeSort s = new MergeSort();
		s.sort(arr,0,arr.length-1);
		for(int l:arr){System.out.print(l+" ");}
	}
}