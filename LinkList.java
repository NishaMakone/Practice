
public class LinkList {
	Node head;
	
	LinkList(){
		head = null;
	}
	
	public void push(Employee val) {
		Node temp = new Node(val);
		if(head == null) {
			head = temp;
		}
		else {
			//Handling 
			temp.setNext(head);
			head = temp;
		}
	}
	
	public void pop() {
		if(head == null) {
			System.out.println("No Employee data present");
		}
		else if(head.getNext() == null) {
			head = null;
		}
		else {
			Node temp;
			temp = head.getNext();
			head.setNext(null);
			head = temp;
		}
	}
	
	public void emptyStack() {
	
		while(head != null) {
			pop();
		}
		
	}
	
	public void maleEmployee() {
		
		if(head == null) {
			System.out.println("No Male employee present");
		}
		else {
			Node temp = head;
			while(temp.getNext() != null) {
				if(temp.getData().getGender() == 'M'  || temp.getData().getGender() == 'm') {
					System.out.println(temp);
				}
				temp = temp.getNext();
			}
		}
	}
	
	public void femaleEmployee() {
		Node temp = head;
		if(head == null) {
			System.out.println("No Female employee present");
		}
		else {
			while(temp.getNext() != null) {
				if(temp.getData().getGender() == 'F') {
					System.out.println(temp);
				}
				else {
				temp = temp.getNext();
				}
			}
		}
	}
	
	public String toString() {
		String str="";
		Node a=head;
		if(head == null) {
			str = " No Employee data present ";
		}
		else {
			while(a.getNext() != null) {
				str = str +a +" ";
				a = a.getNext();
			}
		}	
		str = str + a + " ";
		return str;
	}
}
