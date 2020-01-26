/*
calculating the fibonacci sum number usiing the dynamic programming tabulation method
Tabulation---->Bottom up approach[dynamic programming]

*/
public class Tabulation
{
	int[] val = new int[101];
	public void intial()
	{
		for(int i=0;i<val.length;i++){
		val[i]=0;
		}
		//initialization of base cases
		val[0] = 0;
		val[1] =1;
	}
	public int fib(int n)
	{
		for(int i=2;i<=n;i++){
			val[i] = val[i-1]+val[i-2];
		}
		return val[n];
	}
	
	public static void main(String[] args)
	{
		Tabulation t = new Tabulation();
		t.intial();
		int j = t.fib(100);
		System.out.print(j);
	}
}