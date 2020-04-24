
public class Linnklist1 {
	
	Node head;
	public void insert(int data) {
	Node node = new Node();
	node.data = data;
	node.next=null;
	
    if(head == null) {
    	head = node;
    }
    else {
    	Node n = head;
    	while(n.next!=null) {
    		
    		n = n.next;
    	}
    	n.next = node;
    }
}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		
		if(index == 0) {
			insertAtStart(data);
		}
		
		else {
			
		for(int i=0; i<index-1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
		}
	
	public void deleteAt(int index) {
		Node n = head;
		Node n1 = null;
		if(index == 0) {            //deleting first element
			head = head.next;
		}
		else {
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			n1 = n.next;   //changing address of the values
			n.next = n1.next;
			
			
			n1 = null; //removed deleted value from memory
		}
	}
	
	public void show() {
		Node nde = head;
		while(nde.next != null) {
			System.out.println(nde.data);
			nde = nde.next;
		}
		System.out.println(nde.data); 
	}
}
