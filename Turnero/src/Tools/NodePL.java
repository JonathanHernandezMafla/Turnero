package Tools;

public class NodePL
{
//	Atributos
	private PriorityList list;
	private NodePL next;

//	Constructor
	public NodePL(PriorityList list)
	{
		super();
		this.list = list;
	}

//	Encapsulados

	public PriorityList getList()
	{
		return list;
	}

	public void setList(PriorityList list)
	{
		this.list = list;
	}

	public NodePL getNext()
	{
		return next;
	}

	public void setNext(NodePL next)
	{
		this.next = next;
	}

}
