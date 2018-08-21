package com.suraj.logical.clone;

class Course {
	
	private String subject;

	public Course(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
class Student implements Cloneable {
	
	private int studentId;
	private String studentName;
	private Course course;
	
	public Student(int studentId, String studentName, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class ShallowCloneDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Course course = new Course("java");
		Student student = new Student(111, "suraj", course);
		
		Student studentCopy = (Student) student.clone();
		studentCopy.setStudentId(222);
		studentCopy.setStudentName("rama");
		studentCopy.getCourse().setSubject("oracle");
		System.out.println(studentCopy.getStudentId()+"\t"+studentCopy.getStudentName()+"\t"+studentCopy.getCourse().getSubject());
		
		//for student original object
		System.out.println("for student original object:::");
		System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getCourse().getSubject());
	}
}
