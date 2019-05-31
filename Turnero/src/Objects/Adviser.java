package Objects;

public class Adviser

{
	
//	Atributos
	
	private String name, services;
	private int code, time, date;
	private Person client;
	private boolean state;
	
//	Encapsulados

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public String getServices()
		{
			return services;
		}

	public void setServices(String services)
		{
			this.services = services;
		}

	public int getCode()
		{
			return code;
		}

	public void setCode(int code)
		{
			this.code = code;
		}

	public int getTime()
		{
			return time;
		}

	public void setTime(int time)
		{
			this.time = time;
		}

	public int getDate()
		{
			return date;
		}

	public void setDate(int date)
		{
			this.date = date;
		}

	public Person getClient()
		{
			return client;
		}

	public void setClient(Person client)
		{
			this.client = client;
		}

	public boolean isState()
		{
			return state;
		}

	public void setState(boolean state)
		{
			this.state = state;
		}

}
