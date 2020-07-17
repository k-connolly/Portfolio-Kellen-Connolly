
public class Node {
	
	private Node next=null;
	private String data="";
	
	public Node(Node next,String data) {
		this.next=next;
		this.data=data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public String getData() {
		return data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}

