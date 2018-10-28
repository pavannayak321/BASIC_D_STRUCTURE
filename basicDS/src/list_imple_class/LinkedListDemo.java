package list_imple_class;
import java.util.*;

/* underlying data structure is double Linkedlist 
 * insertion order is preserved 
 * duplicates are allowed 
 * null insertion is possible 
 * ------------------------------------------------
 * -----------------------------------------------
 * best suitable for if our frequent operation is insertion at  the middle 
 * worst choice if our choice is to retrieval of elements 
 * 
 * usually we can implement the stacks and  queues  to support this requirement the
 *  LinkedList class defines the following specific methods 
 *  ------------------------------------------------
 *  ------------------------------------------------
 *  */
public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList l =new LinkedList();
		l.add("pavaan");
		l.add(12);
		l.add(0,12);
		l.addFirst("CVR COLLEGE OF ENGINEERING:");
		System.out.println(l);
		
			
	}

}
