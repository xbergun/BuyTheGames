package Entities;


public class Users {
	private int nationaltyId;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	public Users() {
		
	}

	public Users(int nationaltyId, String firstName, String lastName, String dateOfBirth) {
		
		this.nationaltyId = nationaltyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(int nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
	
	
}
