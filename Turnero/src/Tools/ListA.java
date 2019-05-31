package Tools;

import Objects.Adviser;

public class ListA
{
//	Atributos
	private NodeA head, tail;
	private int size;

//	Encapsulados

	public NodeA getHead()
	{
		return head;
	}

	public void setHead(NodeA head)
	{
		this.head = head;
	}

	public NodeA getTail()
	{
		return tail;
	}

	public void setTail(NodeA tail)
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
	
	public void add(Adviser adviser)
	{

		// Step 1. create the new node
		NodeA newNode = new NodeA(adviser);
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

	public Adviser searchByName(String name)
	{
		Adviser result = null;
		// Create a temporal node to travel around the else nodes.
		NodeA tmp = this.head;
		// While the next to temporal is not null.
		while (tmp != null) {
			// Compare temporal's fact with the entrace's fact
			if (tmp.getAdviser().getName().equals(name)) {
				result = tmp.getAdviser();
			}
			tmp = tmp.getNext();
		}
		return result;
	}

	public Adviser getAt(int pos)
	{
		Adviser result = null;
		NodeA tmp = this.head;
		// Creating the position indicator
		int posTmp = 0;
		// While we are not in the input position
		while (posTmp <= pos) {
			// Storing the current value in temporal object
			result = tmp.getAdviser();
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

		NodeA temp = this.head;

		int pos = 1;

		while (temp != null) {

			list += "N° " + Integer.toString(pos) + "- ";
			list += temp.getAdviser().getCode() + ", ";
			list += temp.getAdviser().getName() + ", ";
			list += temp.getAdviser().getServices() + ", ";
			list += temp.getAdviser().getClient() + ", ";
			list += temp.getAdviser().getTime() + ", ";
			list += temp.getAdviser().getDate() + "\n";
			pos++;
			temp = temp.getNext();
		}
		return list;
	}

	public void deletebyName(String name)
	{
		
		NodeA newNode = new NodeA(null);
		
		NodeA node = this.head;

		NodeA prevNode = null;

		// While the next to temporal is not null.
		while (node != null) {
			// Compare temporal's fact with the entrace's fact
			if (node.getAdviser().getName().equals(name)) {
				prevNode.setNext(node.getNext());
				node = newNode;
			}
			prevNode = node;
			node = node.getNext();
		}
		this.size--;
	}

	
	
}
