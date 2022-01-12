
public class Node {
	Employee data;
	Node next;
	
	Node(){
		next=null;
	}
	Node(Employee d){
		data = d;
		next = null;
	}
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	public String toString() {
		String str = " ";
		str = str + data +" ";
		return str;
	}
}
