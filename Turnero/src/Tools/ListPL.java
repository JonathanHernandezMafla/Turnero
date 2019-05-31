package Tools;

public class ListPL
{
//	Atributos
	private NodePL head, tail;
	private int size;

//	Encapsulados

	public NodePL getHead()
	{
		return head;
	}

	public void setHead(NodePL head)
	{
		this.head = head;
	}

	public NodePL getTail()
	{
		return tail;
	}

	public void setTail(NodePL tail)
	{
		this.tail = tail;
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

//	CRUD

	public void add(PriorityList list)
	{

		// Step 1. create the new node
		NodePL newNode = new NodePL(list);
		// If the head is null
		if (this.head == null) {
			// The new node is the head
			this.head = newNode;
			this.tail = newNode;
		} else {
			// The tail's next is newNode
			this.tail.setNext(newNode);
			// The new node is the tail
			this.tail = newNode;
		}
		this.size++;
	}

	public PriorityList searchByName(String name)
	{
		PriorityList result = null;
		// Create a temporal node to travel around the else nodes.
		NodePL tmp = this.head;
		// While the next to temporal is not null.
		while (tmp != null) {
			// Compare temporal's fact with the entrace's fact
			if (tmp.getList().getHead().getTurn().getPerson().getName().equals(name)) {
				result = tmp.getList();
			}
			tmp = tmp.getNext();
		}
		return result;
	}

	public PriorityList getAt(int pos)
	{
		PriorityList result = null;
		NodePL tmp = this.head;
		// Creating the position indicator
		int posTmp = 0;
		// While we are not in the input position
		while (posTmp <= pos) {
			// Storing the current value in temporal object
			result = tmp.getList();
			// Incrementing the post
			posTmp++;
			// Incrementing temporal
			tmp = tmp.getNext();
		}
		// When the while finish temporal is located in the correct node.
		return result;
	}

	public String listElements()
	{
		String list = "";

		NodePL temp = this.head;

		int pos = 1;

		while (temp != null) {

			list += "N° " + Integer.toString(pos) + "- ";
			list += temp.getList().getHead().getTurn().getPerson().getId() + ", ";
			list += temp.getList().getHead().getTurn().getPerson().getName() + ", ";
			list += temp.getList().getHead().getTurn().getPerson().getService() + ", ";
			list += temp.getList().getHead().getTurn().getPerson().getState() + ", ";
			list += temp.getList().getHead().getTurn().getPriority() + "\n";
			pos++;
			temp = temp.getNext();
		}
		return list;
	}

	public void deletebyName(String name)
	{
		
		NodePL newNode = new NodePL(null);
		
		NodePL node = this.head;

		NodePL prevNode = null;

		// While the next to temporal is not null.
		while (node != null) {
			// Compare temporal's fact with the entrace's fact
			if (node.getList().getHead().getTurn().getPerson().getName().equals(name)) {
				prevNode.setNext(node.getNext());
				node = newNode;
			}
			prevNode = node;
			node = node.getNext();
		}
		this.size--;
	}

}
