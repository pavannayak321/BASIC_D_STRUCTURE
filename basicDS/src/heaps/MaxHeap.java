public class MaxHeap
{
	private int[] Heap;
	private int size;
	private int maxsize;
	
	
	//constructor to initialize an empty max heap with max heap capacity
	public MaxHeap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[maxsize+1];
		Heap[0] = Integer.MAX_VALUE;
	}
	
	private int parent(int pos)
	{
		return pos/2;
	}
	
	private int leftChild(int pos)
	{
		return pos*2;
	}
	
	private int rightChild(int pos)
	{
		return pos*2+1;
	}
	
	//return's is leaf 
	private boolean isLeaf(int pos)
	{
		if(pos<=size && pos>=(size/2)){
			return true;
		}
		return false;
	}
	
	//swap 
	private void swap(int fpos,int spos)
	{
		int tmp;
		tmp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = tmp;
	}
	
	
	//insert
	public void insert(int element)
	{
		Heap[++size] = element;
		//Traverse up and fix violated property
		int current = size;
		while(Heap[current] > Heap[parent(current)])
		{
			swap(current,parent(current));
			current = parent(current);
		}
	}
	
	//Heapify
	private void maxHeapify(int pos)
	{
		//Base case
		if(isLeaf(pos)){
			return;
		}
		
		if(Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]){
			{
				if(Heap[leftChild(pos)] > Heap[rightChild(pos)]){
					swap(pos,leftChild(pos));
					maxHeapify(leftChild(pos));
				}
				else{
					swap(pos,rightChild(pos));
					maxHeapify(rightChild(pos));
				}
			}
		}
	}
	
	//remove an element from max heap
	public int  extractMax()
	{
		int popped  = Heap[1];
		Heap[1] = Heap[size--];
		maxHeapify(1);
		return popped;
	}
	
	
	public void print()
	{
		for(int i=1;i<=size/2;i++){
			System.out.print("Parent "+Heap[i]+" "+"Left child->"+Heap[i*2]+" "+"Right Child->"+Heap[2*i+1]);
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Thhe Max Heap is");
		System.out.println("The Max Heap is "); 
        MaxHeap maxHeap = new MaxHeap(15); 
        maxHeap.insert(5); 
        maxHeap.insert(3); 
        maxHeap.insert(17); 
        maxHeap.insert(10); 
        maxHeap.insert(84); 
        maxHeap.insert(19); 
        maxHeap.insert(6); 
        maxHeap.insert(22); 
        maxHeap.insert(9); 
  
        maxHeap.print(); 
		 System.out.println("The max val is " + maxHeap.extractMax());
	}
}
		
	