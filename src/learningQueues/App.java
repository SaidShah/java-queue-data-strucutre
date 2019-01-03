package learningQueues;

public class App {

	public static void main(String[] args) {

		
		Queue myQueue = new Queue(12);
		myQueue.insert(100);
		myQueue.insert(40);
		myQueue.insert(180);
		myQueue.insert(7);
		myQueue.insert(1025);
		myQueue.insert(410);
		myQueue.insert(280);
		myQueue.insert(74);
		myQueue.insert(105);
		
		
		myQueue.view();
		System.out.println();
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		myQueue.view();
		System.out.println();
		myQueue.insert(99999);
	    myQueue.view();
	    System.out.println();
	    System.out.println(myQueue.peekFront());
	}

}
