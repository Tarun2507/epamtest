import java.util.Date;
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
	return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here

	}

	@Override
	public Student getStudent(int index) {
		int a=0; 
		String b=null;
		Date date=null;
		double avg=0.0d;
		if(index<=0 || index>students.length)
		{
			throw new IllegalArgumentException();
		}
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			if(i==index)
			{
				 a=students[i].id;
				 b=students[i].fullName;
				 date=students[i].birthDate;
				  avg=students[i].avgMark;
			}
		}
		Student s= new Student(a,b,date,avg);
		return s;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<=0 || index>students.length || student==null)
		{
			throw new IllegalArgumentException();
		}
		int id=student.id;
		String fullname=student.fullName;
		Date date=student.birthDate;
		double m=student.avgMark;
		students[index].id=id;
		students[index].fullName=fullname;
		students[index].birthDate=date;
		students[index].avgMark=m;
	}

	@Override
	public void addFirst(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		int id=student.id;
		String fullname=student.fullName;
		Date date=student.birthDate;
		double m=student.avgMark;
		for(int i=students.length;i>=0;i--)
		{
			students[i]=students[i-1];
	}
	students[0].id=id;
	students[0].fullName=fullname;
	students[0].birthDate=date;
	students[0].avgMark=m;
	}
	@Override
	public void addLast(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		int length=students.length;
		students[length].id=student.id;
		students[length].fullName=student.fullName;
		students[length].birthDate=student.birthDate;
		students[length].avgMark=student.avgMark;
	}

	@Override
	public void add(Student student, int index) {
			if(index<=0 || index>students.length || student==null)
			throw new IllegalArgumentException();
			for(int i=students.length;i>=index;i--)
		{
			students[i]=students[i-1];
	}
	students[index].id=student.id;
	students[index].fullName=student.fullName;
	students[index].birthDate=student.birthDate;
	students[index].avgMark=student.avgMark;
	}

	@Override
	public void remove(int index) {
		if(index<=0 || index>students.length)
			throw new IllegalArgumentException();
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
	}

	@Override
	public void remove(Student student) {
		for(int i=0;i<students.length;i++)
		{
			if(student.id==students[i].id)
				{
					for(int j=i;j<students.length;j++)
					{
						students[j]=students[j+1];
					}
				}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
