package day4;



import java.time.LocalDateTime;




public class Employee {
	
	
	
	private int empId;

	private String fullName;
	
	private LocalDateTime dateOfJoining;
	
	private Residenceaddress residence;
	
	private  OfficeAddress communication;
	
	static int managerId;

	public Employee(int empId, String fullName, LocalDateTime dateOfJoining, Residenceaddress residence,
			OfficeAddress communication) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.residence = residence;
		this.communication = communication;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Residenceaddress getResidence() {
		return residence;
	}

	public void setResidence(Residenceaddress residence) {
		this.residence = residence;
	}

	public OfficeAddress getCommunication() {
		return communication;
	}

	public void setCommunication(OfficeAddress communication) {
		this.communication = communication;
	}

	public static int getManagerId() {
		return managerId;
	}

	public static void setManagerId(int managerId) {
		Employee.managerId = managerId;
	}
	
	
	
	
	
	
	
	
	
}