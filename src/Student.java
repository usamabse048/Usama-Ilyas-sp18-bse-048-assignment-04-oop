import java.io.Serializable;

public class Student extends Person implements Serializable
{
	private double gpa;
	private int semester;
	private String section;
	private Department d;
	
	public Student()
	{
		super();
	}
	
	public Student(String n,char gender,String ph ,int sem,String sec,double gpa,Department d)  
	{
		super(n,ph,gender);
		if(gpa>0)
		{
			this.gpa = gpa;
		}
		if(sem>0 && sem<=12)
		{
			this.semester = sem;
		}
		this.section = sec;
		this.d = d;
			
	}
	
	//setter
	
	public void setGpa(double gpa)
	{
		if(gpa>0)
		{
			this.gpa = gpa;
		}
		
	}
	
	public void setSection(String section)
	{
		this.section = section;
	}
	
	public void setSemester(int semester)
	{
		if(semester>0 && semester<=12)
		{
			this.semester = semester;
			
		}
		
	}
	
	public void setD(Department d) 
	{
		this.d = d;
	}
	
	@Override
	public void setGender(char gender)
	{
		super.setGender(gender);
	}
	
	@Override
	public void setName(String name)
	{
		super.setName(name);
	}
	
	@Override
	public void setPhone(String phone) 
	{
		super.setPhone(phone);
	}
	
	
	
	//getter
	@Override
	public char getGender() 
	{
		return super.getGender();
	}
	
	@Override
	public String getName()
	{
		return super.getName();
	}
	
	@Override
	public String getPhone() 
	{
		return super.getPhone();
	}
	
	public Department getD() 
	{
		return d;
	}
	
	public double getGpa() 
	{
		return gpa;
	}
	
	public String getSection()
	{
		return section;
	}
	
	public int getSemester()
	{
		return semester;
	}

	//toSTring
	public String toString()
	{
		return "Name: "+ super.getName()+"      Gender: "+super.getGender()+"\nSemester: "+this.semester+"     Section:"+this.section
				+"\n"+this.d.toString()+"\nPhone Number: "+super.getPhone();
	}

}
