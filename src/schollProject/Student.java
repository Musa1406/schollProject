package schollProject;

public class Student extends Person{
   private String professionField;
   private int schollLevel;
   private String schollNumber;
   private int studentClass;
public Student() {
	super();
}
public Student(String professionField, int schollLevel, String schollNumber, int studentClass) {
	super();
	this.professionField = professionField;
	this.schollLevel = schollLevel;
	this.schollNumber = schollNumber;
	this.studentClass = studentClass;
}
public String getProfessionField() {
	return professionField;
}
public void setProfessionField(String professionField) {
	this.professionField = professionField;
}
public int getSchollLevel() {
	return schollLevel;
}
public void setSchollLevel(int schollLevel) {
	this.schollLevel = schollLevel;
}
public String getSchollNumber() {
	return schollNumber;
}
public void setSchollNumber(String schollNumber) {
	this.schollNumber = schollNumber;
}
public int getStudentClass() {
	return studentClass;
}
public void setStudentClass(int studentClass) {
	this.studentClass = studentClass;
}
}
