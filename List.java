public class List {
	static Node head;

	static void Node(int d) {
		data = d;
		link = null;
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.printl(n.data + "......");
			n = n.link;
		}
	}

	public static void main(String[] args) {
		List l1 = new List();
		l1.head = new Node(11);

		Node second = new Node(22);
		Node third = new Node(33);

		l1.head.link = second;
		second.link = third;
	}
}