package OOPS;

import java.util.Arrays;

class Student{
	private short id;
	private String name;
	private String courseName;
	private byte courseDuration;
	private byte[] marksObtained;
	static final String COLLEGE_NAME = "PDM University";
	
	//Don't Repeat Yourself
	//static says that it will be bonded with the class only
	//static will be loaded in memory when class is loaded
	//static is only created once and will be shared by all the objects
	//FINAL variable should always be written in capital/block letters
	
	Student(int id,String name ){
		this.id = (short) id;
		this.name = name;
		
		
	}
	
//	//setter
	void setName(String name) {
		if(name!=null && name!="")
		this.name = name;
	}
//	
//	//getter
//	byte[] gerMarksObtained() {
//		return marksObtained;
//	}
	
	//getter-setter
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public byte getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(byte courseDuration) {
		this.courseDuration = courseDuration;
	}

	public byte[] getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(byte[] marksObtained) {
		this.marksObtained = marksObtained;
	}

	public short getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	void takeInput(int id, String name, int courseDuration, String courseName, byte[] marksObtained ) {
//		id  =(short)student_id;
//		name = student_name;
		this.courseDuration = (byte) courseDuration;
		this.courseName = courseName;
		this.marksObtained = marksObtained;
		
		
	}
//	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", marksObtained=" + Arrays.toString(marksObtained) + "]";
	}

//	void showDetails() {
//		System.out.println("Student Id is:" + id);
//		System.out.println("Student name is:" + name);
//		System.out.println("Student course is:" + courseName);
//		System.out.println("Student course duration is:" + courseDuration);
//		System.out.println("Student marks obtained is:" + Arrays.toString(marksObtained));
//		System.out.println("Student college is:" + Student.COLLEGE_NAME);
//		
//	}
}



public class Demo {

	public static void main(String[] args) {
		Student student = new Student(101, "Avanish");
//		student.id = 101;
//		student.name = "Avanish Srivastava";
//		//student.college_name = "PDM University";
//		student.courseName = "BCA";
//		student.courseDuration = 3;
		student.takeInput(101, "Avanish", 3, "BCA", new byte[] {90, 80, 88, 92, 100});
		student.setName("Avi");
		//student.marksObtained = new byte[] {90, 80, 88, 92, 100};
		//student.showDetails();
		
		Student student2 = new Student(102, "Aman");
//		student2.id = 102;
//		student2.name = "Aman";
//		//student.college_name = "PDM University";
//		student2.courseName = "Btech";
//		student2.courseDuration = 4;
		student2.takeInput(102, "Aman", 3, "BCA", new byte[] {90, 70, 88, 80, 70});
		//student2.marksObtained = new byte[] {90, 70, 88, 80, 70};
		//student2.showDetails();
		
		
		Student student3 = new Student(103, "Ankit");
//		student3.id = 103;
//		student3.name = "Ankit";
//		//student.college_name = "PDM University";
//		student3.courseName = "MCA";
//		student3.courseDuration = 2;
		student3.takeInput(103, "Ankit", 3, "BCA", new byte[] {90, 60, 78, 82, 90});
		//student3.marksObtained = new byte[] {90, 60, 78, 82, 90};
		//student3.showDetails();

		

		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		//System.out.println(Student.COLLEGE_NAME);
		
		

	}

}
