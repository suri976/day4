package day4;
import java.time.LocalDateTime;





public class EmployeeAddress {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		Residenceaddress res=Residenceaddress.builder().time("2nd").phone(9566512L).floors(3).build();
				
		//Residenceaddress res=new Residenceaddress("1st floor","gjh","trp","12",6576L,8);
		
		//OfficeAddress off=new OfficeAddress("1st floor","gjh","trp","12",6576L,8);
		OfficeAddress off=OfficeAddress.builder().time("2nd").phone(9566512L).floors(3).build();
		
		Employee  std=new Employee(1,"suresh",LocalDateTime.now(),res,off);
		
		
		System.out.println(res);
		System.out.println(off);
		System.out.println(std);
		
		
		
		System.out.println(res);
		System.out.println(off);
		System.out.println(std);
		
		

		Address res1=new Address("56-34","fgh","rjy");
		Address off1=new Address("2nd floor","gjh","vzy");
		Employee  emp1=new Employee(24,"somesh",LocalDateTime.now(),res,off);
		
		System.out.println(res1);
		System.out.println(off1);
		System.out.println(emp1);
		
		

		Address res2=new Address("45-34","hre","viayanagaram");
		Address off2=new Address("5th floor","gjh","khammam");
		Employee  emp2=new Employee(36,"mani",LocalDateTime.now(),res,off);

		
		System.out.println(res2);
		System.out.println(off2);
		System.out.println(emp2);
		
		Address res3=new Address("65-34","r nilayam","guntur");
		Address off3=new Address("6th floor","k block","khammam");
		Employee  emp3=new Employee(54,"ganesh",LocalDateTime.now(),res,off);
		
		System.out.println(res3);
		System.out.println(off3);
		System.out.println(emp3);
		
		
		
		
	}

}