package Tools;

import Objects.Person;

public class Turn
{

//	Atributos
	private Person person;
	private int priority;

//	Constructor
	public Turn(Person person)

	{
		this.person = new Person(person);
	}

	public Turn(Turn turn)
	{
		// TODO Auto-generated constructor stub
	}

//	Encapsulados
	public Person getPerson()
	{
		return person;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

	public int getPriority()
	{
		return priority;
	}

	public void setPriority(int priority)
	{
		this.priority = priority;
	}

}
