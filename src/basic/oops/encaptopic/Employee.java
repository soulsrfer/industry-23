package basic.oops.encaptopic;

// private - Within class
// POJO - Plain Old Java Object---Pure Encapsulation Example
public class Employee 
{
//	Data---store--Dm's
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	
	
	// method---public
	// setters - Mutators
	public void setId(int id) 
	{
		this.id=id;
	}
	// Accessors---getters
	public int getId() 
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
}
