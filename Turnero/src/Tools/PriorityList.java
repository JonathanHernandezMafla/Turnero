package Tools;

public class PriorityList
{
//	Atributos

	private NodeP head, tail;
	private int size;

//	Encapsulados
	public NodeP getHead()
	{
		return head;
	}

	public void setHead(NodeP head)
	{
		this.head = head;
	}

	public NodeP getTail()
	{
		return tail;
	}

	public void setTail(NodeP tail)
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

	public void add(Turn turn)
	{

		// Step 1. create the new node
		NodeP newNode = new NodeP(turn);
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

	public Turn searchByName(String name)
	{
		Turn result = null;
		// Create a temporal node to travel around the else nodes.
		NodeP tmp = this.head;
		// While the next to temporal is not null.
		while (tmp != null) {
			// Compare temporal's fact with the entrace's fact
			if (tmp.getTurn().getPerson().getName().equals(name)) {
				result = tmp.getTurn();
			}
			tmp = tmp.getNext();
		}
		return result;
	}

	public Turn getAt(int pos)
	{
		Turn result = null;
		NodeP tmp = this.head;
		// Creating the position indicator
		int posTmp = 0;
		// While we are not in the input position
		while (posTmp <= pos) {
			// Storing the current value in temporal object
			result = tmp.getTurn();
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

		NodeP temp = this.head;

		int pos = 1;

		while (temp != null) {

			list += "N° " + Integer.toString(pos) + "- ";
			list += temp.getTurn().getPerson().getId() + ", ";
			list += temp.getTurn().getPerson().getName() + ", ";
			list += temp.getTurn().getPerson().getService() + ", ";
			list += temp.getTurn().getPerson().getState() + ", ";
			list += temp.getTurn().getPriority() + "\n";
			pos++;
			temp = temp.getNext();
		}
		return list;
	}

	public void deletebyName(String name)
	{
		
		NodeP newNode = new NodeP(null);
		
		NodeP node = this.head;

		NodeP prevNode = null;

		// While the next to temporal is not null.
		while (node != null) {
			// Compare temporal's fact with the entrace's fact
			if (node.getTurn().getPerson().getName().equals(name)) {
				prevNode.setNext(node.getNext());
				node = newNode;
			}
			prevNode = node;
			node = node.getNext();
		}
		this.size--;
	}

}
