package Tools;

import Objects.Adviser;

public class NodeA
{
//	Atributos

	private Adviser adviser;
	private NodeA next;

//	Constructor
	public NodeA(Adviser adviser)
	{
		super();
		this.adviser = adviser;
	}
//	Encapsulados

	public Adviser getAdviser()
	{
		return adviser;
	}

	public void setAdviser(Adviser adviser)
	{
		this.adviser = adviser;
	}

	public NodeA getNext()
	{
		return next;
	}

	public void setNext(NodeA next)
	{
		this.next = next;
	}

}
