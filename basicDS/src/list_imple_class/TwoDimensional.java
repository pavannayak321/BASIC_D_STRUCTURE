package list_imple_class;

public class TwoDimensional
{

	public static void main(String[] args) 
	{
		int [][]  a=
					{
							{1,2,3},
							{4,5},
							{6,7,8,9}
				
					};
		System.out.println(a.length);//------------>3
		for(int[] b:a)
		{
			for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]);
			}
			System.out.println();
		}

	}

}
