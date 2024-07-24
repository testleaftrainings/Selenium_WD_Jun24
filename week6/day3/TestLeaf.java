package week6.day3;

public class TestLeaf {

	private String employeName;
	private String employeeId;
	private long employePhno;
	
	
	public void setEmployeeDetails(String employeName , String employeeId ) {
		this.employeName = employeName;
		this.employeeId = employeeId;
	}

	public void getEmployeeDetails() {
		System.out.println(employeName);
		System.out.println(employeeId);
	}

	public long getPhno() {
		return employePhno;
	}

	public void setPhno(long employePhno) {
		this.employePhno = employePhno;
	}

	


	
}
