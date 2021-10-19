package schollProject;

public class Person {
	private String nationalIdentity;
	private String name;
	private String surname;
	private int birtYear;
	private String gender;
	private String username;
    private String paswword;
	public Person() {
		super();
	}
	public Person(String nationalIdentity, String name, String surname, int birtYear, String gender, String username,
			String paswword) {
		super();
		this.nationalIdentity = nationalIdentity;
		this.name = name;
		this.surname = surname;
		this.birtYear = birtYear;
		this.gender = gender;
		this.username = username;
		this.paswword = paswword;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getBirtYear() {
		return birtYear;
	}
	public void setBirtYear(int birtYear) {
		this.birtYear = birtYear;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPaswword() {
		return paswword;
	}
	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}
}
