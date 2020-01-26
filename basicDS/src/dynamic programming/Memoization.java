/*
calcuulating the fibonaci series upto nth number
*/


class Memoization
{
	int[] lookup =  new int[123];
	public void intit()
	{
		for(int i=0;i<lookup.length;++i)
		{
			lookup[i] = -1;
		}
	}
	
	public int fib(int n)
	{
	if(lookup[n]==-1){
		if(n<=1){
			return n;
		}
	}
		return lookup[n] = fib(n-1)+fib(n-2);
	}
	
	
	public static void main(String[] args)
	{
		Memoization mtble = new Memoization();
		mtble.intit();
		int j = mtble.fib(9);
		System.out.print(j);
	}
}