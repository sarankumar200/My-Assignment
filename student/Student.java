package student;

public class Student {
	public void getStudentInfo(int studentId) {
		System.out.println(studentId);
	}
	public void getStudentInfo(int studentId,String studentName) {
		System.out.println(studentId+","+studentName);
	}
	public void getStudentInfo(String studentEmailId,long studentPhone) {
		System.out.println(studentEmailId+","+studentPhone);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.getStudentInfo(1234);
		obj.getStudentInfo(1234,"saran");
		obj.getStudentInfo("saran@gmail", 63367854764l);
	}

}
