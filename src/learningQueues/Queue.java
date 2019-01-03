package learningQueues;

public class Queue {

	private int maxSize;// size of the queue
	private long[] queArray;// the queue array
	private int front;// the index position for the first element in the queue
	private int rear;// the index position for the back of the line in the queue
	private int nItems; // counter to maintain the number of items in the queue
	
	public Queue(int size) {
		this.maxSize=size;
		queArray = new long[maxSize];
		front =0;// front of the line
		rear =-1;// last item but ATM there are no elements in the queue
		nItems=0;// there are no elements in the array yet
	}
	
	public void insert(long element) {
		if(rear==maxSize-1) {// if the array gets full it overwrites again from the begining
			rear=-1;
		}
		rear++;
		queArray[rear]=element;
		nItems++;
	}
	
	public void view() {
		System.out.print("{ ");
		for(int i =0;i<queArray.length;i++) {
			System.out.print(queArray[i]+", ");
		}
		System.out.print("}");
	}
	
	public long remove() {// remove item from the front of the queue
		long tempValue = queArray[front];
		front++;
		
		if(front==maxSize) {
			front = 0;// set front back to 0th index so we can use the entire queue again
		}
		nItems--;
		return tempValue;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems==0);
	}
	
	public boolean isFull() {
		return (nItems==maxSize);
	}
	
	
	
}



















































