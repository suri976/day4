package day4;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OfficeAddress extends Address {
	
	
private String time;
	
	private long phone;
	
	private int floors;

}


