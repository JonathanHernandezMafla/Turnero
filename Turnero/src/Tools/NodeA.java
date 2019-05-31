package Tools;

import Objects.Adviser;

public class NodeA
{
//	Atributos
	
	private Adviser adviser;
	private NodeA next;
	
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
