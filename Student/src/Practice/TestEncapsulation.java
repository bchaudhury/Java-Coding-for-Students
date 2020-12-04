package Practice;

class Employee{
	private int EmpNo;
	private String EmpName;
	private String EmpMobile;
	
	public int getEmpNo()
	{
		return EmpNo;
	}
	
	public String getEmpName()
	{
		return EmpName;
	}
	
	public String getEmpMobile()
	{
		return EmpMobile;
	}
	
	public void setEmpNo(int EmpNo)
	{
		this.EmpNo = EmpNo;
	}
	
	public void setEmpName(String EmpName)
	{
		this.EmpName = EmpName;
	}
	
	public void setEmpMobile(String EmpMobile)
	{
		this.EmpMobile = EmpMobile;
	}

}

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmpNo(1);
		e.setEmpName("Bhaskar Chaudhury");
		e.setEmpMobile("9432075119");
		System.out.println("Emp No: " + e.getEmpNo());
		System.out.println("Emp Name: " + e.getEmpName());
		System.out.println("Emp Mobile: " + e.getEmpMobile());		
		e.setEmpNo(2);
		e.setEmpName("Rajat Basak");
		e.setEmpMobile("8910129253");
		System.out.println("Emp No: " + e.getEmpNo());
		System.out.println("Emp Name: " + e.getEmpName());
		System.out.println("Emp Mobile: " + e.getEmpMobile());
		e=null;
	}

}
