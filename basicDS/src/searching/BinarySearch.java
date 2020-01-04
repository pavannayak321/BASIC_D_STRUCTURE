class BinarySearch
{
	public static void binarySrchIter(int[] arr,int target)
	{
		
		int l=0;
		int high =arr.length-1;
		
		while(l <= high)
		{
			int mid = l+(high-l)/2;
			if(arr[mid]==target){
				System.out.println("Target Found at"+mid);
				return;
			}
			else if(arr[mid] > target){
				high = mid-1;
			}
			else{
				l = mid+1;
			}
		}
	}
	
	//binary search recursive
	public static int binarySearch(int[] arr, int l ,int h,int t)
	{
		int mid = l+(h-l)/2;
		
		
		if(t==arr[mid]){
			System.out.println("Target Found At"+mid);
			return mid;
		}
		if(arr[mid] > t){
			binarySearch(arr,l,mid-1,t);
		}
		else{
			binarySearch(arr,mid+1,h,t);
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] arr={3,4,5,6,7,8,8,9};
		binarySrchIter(arr,8);
		binarySearch(arr,0,arr.length-1,8);
	}
}