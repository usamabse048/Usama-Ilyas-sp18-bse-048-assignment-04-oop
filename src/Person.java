import java.io.Serializable;

public class Person implements Serializable
{
	private String name;
	private String phone;
	private char gender;
	
	public Person() 
	{
		
	}
	public Person(String n,String ph ,char gender)
	{
		this.name = n;
		this.phone = ph;
		this.gender = gender;
	}
	//setter
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	//getter
	public char getGender() 
	{
		return gender;
	}
	public String getName() 
	{
		return name;
	}
	public String getPhone()
	{
		return phone;
	}
	
	@Override
	public String toString()
	{	
		return "Name: "+this.getName()+" 	Gender: "+this.getGender()+"\nPhone Num: "+this.getPhone();
	}
	
	
	

}
