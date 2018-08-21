package com.suraj.logical.clone;

class Course1 implements Cloneable{
	
	private String subject;

	public Course1(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Student1 implements Cloneable {
	
	private int studentId;
	private String studentName;
	private Course1 course;
	
	public Student1(int studentId, String studentName, Course1 course) {
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

	public Course1 getCourse() {
		return course;
	}

	public void setCourse(Course1 course) {
		this.course = course;
	}

	public Object clone() throws CloneNotSupportedException {
		Student1 student = (Student1)super.clone();
		student.course = (Course1)course.clone();		
		return student;
	}
}

public class DeepCloneDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Course1 course = new Course1("java");
		Student1 student = new Student1(111, "suraj", course);
		
		Student1 studentCopy = (Student1) student.clone();
		studentCopy.setStudentId(222);
		studentCopy.setStudentName("rama");
		studentCopy.getCourse().setSubject("oracle");
		System.out.println(studentCopy.getStudentId()+"\t"+studentCopy.getStudentName()+"\t"+studentCopy.getCourse().getSubject());
		
		//for student original object
		System.out.println("for student original object:::");
		System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getCourse().getSubject());
	}
}
