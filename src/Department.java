import java.io.Serializable;

public class Department implements Serializable
{
	private String name;
	private String location;
	
	public Department() {}
	
	public Department(String n,String l)
	{
		this.name = n;
		this.location = l;
	}
	
	//setter
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	//getter
	
	public String getLocation() 
	{
		return location;
	}
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString() 
	{
		return "\n Department Name: "+this.getName()+"	         Location: "+this.location;
	}

}
