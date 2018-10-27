package list_imple_class;


public class PrintPattern

{

	public static void main(String[] args)
	{
		
		/*
		 * 1
		 * 2 2
		 * 3 3 3
		 * 4 4 4 4
		 */
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			System.out.println("");
			
		}
		//---------------------------------------------
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		for(int i=6;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
	//------------------------------------------------------------------------
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"");
			}
			System.out.println();
		}
/*
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
		 */
//-------------------------------------------------------------------------------------
for(int i=1;i<=7;i++)
{
	for(int j=1;j<=i;j++)
	{
		
		System.out.print(j);
	}
	for (int j = i-1; j >= 1; j--)
    {
        System.out.print(j);
    }
     
	System.out.println();
}
System.out.println("---------------------------------------------------");
/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2
*/ 
//----------------------------------------------------------------------------------
for(int i=2;i<=9;i++)
{
	for(int j=i-1;j<=7;j++)
	{
		System.out.print(j+"");
	}
	System.out.println();
}
/*1234567
234567
 34567
  4567
   567
    67
     7
    67
   567
  4567
 34567
234567
1234567
*/
	}

}
