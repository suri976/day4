package day4;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Address {
	
	@Setter
	@Getter
	private String doorNo;
	@Setter
	@Getter
	private String building;
	@Setter
	@Getter
	private String city;
	
	
	
	
	
	

}