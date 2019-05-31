package Tools;

public class NodeP
{

//	Atributos
	private Turn turn;
	private NodeP next;

//	Constructor

	public NodeP(Turn turn)
	{
		this.turn = new Turn(turn);
	}

//	Encapsulados
	public Turn getTurn()
	{
		return turn;
	}

	public void setTurn(Turn turn)
	{
		this.turn = turn;
	}

	public NodeP getNext()
	{
		return next;
	}

	public void setNext(NodeP next)
	{
		this.next = next;
	}

}
