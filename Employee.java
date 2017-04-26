import java.io.Serializable;


public class Employee implements Serializable{

	private  int empId;
	private int empSalary;
	private  String  empName;

	public Employee(int empId, int empSalary, String empName) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empSalary=" + empSalary
				+ ", empName=" + empName + "]";
	}



}
