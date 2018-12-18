import java.util.Scanner;
class Queue {

	private int[] array;
	private int size;
	private int point;

	Queue(int size){
		this.size = size;
		array = new int[size];
		point = -1;
	}
	public void push(int num) {
	    point++;
		array[point] = num;
	}
	public boolean empty() {
		return (point == -1);
	}
	public int readRear() {
		return array[size - 1];
	}
	public boolean full() {
		return (point == size - 1);
	}
	public int readHead() {
		return array[0];
	}
	public int remove() {
		int n = 0;
		if (empty()) {
			System.out.println("queue empty");
			return n;
		}
		else {
			n = array[0];
			for(int i = 0; i<size-1; i++) {
				array[i] = array[i+1];
			}
			point--;
			return n;
		}
	}

}

public class PSeven {

	public static void main(String args[]) {
    Queue p1 = new Queue(5);
    Queue p2 = new Queue(5);
	Scanner scan = new Scanner(System.in);
    int count = 0;
	String result = "botva";

		for(int i = 0; i<5; i++){
		    System.out.println("Enter player 1. Card№"+i);
			p1.push( scan.nextInt());
		}

		for(int i = 0; i<5; i++){
		    System.out.println("Enter player 2. Card№"+i);
			p2.push(scan.nextInt());
		}

		while((count<106)&&(!p1.empty()) && (!p2.empty()) ) {
			count++;
			if(((p1.readHead() > p2.readHead()) && p2.readHead()!=0) || (p1.readHead()==0 && p2.readHead()==9)) {
				p1.push(p1.readHead());
				p1.remove();
				p1.push(p2.remove());
			}
			else {
				int temp = p2.remove();
				p2.push(p1.readHead());
				p2.push(temp);
				p1.remove();
			}
		}

		if(p2.empty())
		    result = "first";
		if(p1.empty())
		    result = "second";

		System.out.println("Player "+result+". Moves "+count);
	}

}