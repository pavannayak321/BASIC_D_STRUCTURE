package basic_DS;
/*
 * one dimensional array example
 */
public class Bottles
{
	String name;
	double price;
	double  capacity;
			private Bottles()
			{
				
			}
			public Bottles(String name,double price,double capacity)
			{
				this.name=name;
				this.price=price;
				this.capacity=capacity;
			}
			/*
			 * creating reference to the anonymous object 
			 */
			public void createObject(Bottles[] a)
			{
				Bottles[] b1= new Bottles[a.length];
				
				for(int i=0;i<a.length;i++)
				{
					b1[i]=a[i];
				}
				System.out.println(b1[1].name);
				
			}
			
			
			public void show(Bottles[] a)
			{
				for(Bottles b:a)
				{
					System.out.println("name is "+b.name+"      "+'\t'+"price is "+b.price+"   "+'\t'+"capacity is"+b.capacity);
					//Bottles b1[i]=b[i];
					//System.out.println(b1[i].name);
				}
			}
	public static void main(String[] args)
	{
		Bottles btl = new Bottles();
		btl.show(new Bottles[] {new Bottles("pavan",12,23),new Bottles("google",23.3,45)});
		btl.createObject(new Bottles[] {new Bottles("pavan",12,23),new Bottles("google",23.3,45)});
	}

}
