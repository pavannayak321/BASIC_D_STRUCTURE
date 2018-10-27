package list_imple_class;
import java.util.*;
public class ArrayListDemo 
{
	public static void printSchoolPro()
	{
		
	}
	public  static void printStudentneeds(ArrayList<String> sl)
	{
		for(String S1:sl)
		{
			System.out.println(S1);
		}
		
	}

	public static void main(String[] args)
	{
		/*
		 * adding the student needs object into the list 
		 */
		ArrayList<String> sl = new ArrayList();
							sl.add("PEN");
							sl.add("BOOK");
							sl.add("PENCIL");
							sl.add(3,"RUBBER");
							printStudentneeds(sl);

	}

}
