package codingStandards;

/* This is an example of a user class to demonstrate some coding conventions
 * to go alongside my handbook.
*/
public class SampleUser {

	private String firstName;		//how to correctly name variables
	private String surname;
	private int age;
	private int phoneNumber;

	public SampleUser() {

	}

	// Constructor with details for a user.
	public SampleUser(String firstName, String surname, int age, int phoneNumber) {
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	// Getter Method for first name
	public String getFirstName() {
		return firstName;
	}

	// Setter Method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter Method for surname
	public String getSurname() {
		return surname;
	}

	// Setter Method for surname
	public void setSurname(String surname) {
		this.surname = surname;
	}

	// Getter Method for age
	public int getAge() {
		return age;
	}

	// Setter Method for age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter Method for phoneNumber
	public int getPhoneNumber() {
		return phoneNumber;
	}

	// Setter Method for phoneNumber
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// toString method for a User that displays all their details
	@Override
	public String toString() {
		return "SampleUser [firstName=" + firstName + ", surname=" + surname + ", age=" + age + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
