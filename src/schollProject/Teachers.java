package schollProject;

public class Teachers extends Person{
	private String branch;
	private String university;
	private String startDate;
	private String isStaff;
	public Teachers() {
		super();
	}
	public Teachers(String branch, String university, String startDate, String isStaff) {
		super();
		this.branch = branch;
		this.university = university;
		this.startDate = startDate;
		this.isStaff = isStaff;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getIsStaff() {
		return isStaff;
	}
	public void setIsStaff(String isStaff) {
		this.isStaff = isStaff;
	}

}
