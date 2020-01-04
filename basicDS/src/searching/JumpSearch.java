import java.lang.Math;
class JumpSearch{
	public static void jumpSearch(int[] arr,int t)
	{
		//find the optimal block size to be jumped
		int b = (int)Math.sqrt(arr.length-1);
		//System.out.println(b);
		int start=0;
		int prev=0;
		
		while(start< arr.length && arr[start] < t){
			prev = start;
			start = start+b;
		}
		//System.out.println(prev);---8
		boolean found =false;
		int index_f =0;
		for(int i=prev;i<=prev+b &&i <arr.length;i++){
			if(arr[i] == t){
				found=true;
				index_f = i;
			}
		}
		if(found){System.out.println("Search is Succesful \t"+index_f);}
		else{System.out.println("Not Found");}	
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,90,94,123,344,6768,789,912,934,956,967};
		jumpSearch(arr,790);
	}
}
