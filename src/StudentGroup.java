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
		try{
			if(students==null)
			{
				throw new IllegalArgumentException();
			}
			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		/*finally{
			return null;
		}*/
		
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		try{
			if(index<0||index>=students.length)
			{
				throw  new IllegalArgumentException();
			}
		}
		finally{
		return null;
		}
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		  ArrayList<Student> a = new ArrayList<Student>(Arrays.asList(students));
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
				
			}
			else if (index<0||index>=students.length)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				a.add(index,student);
			}
			
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}

	@Override
	public void addFirst(Student student) {
		ArrayList<Student> a = new ArrayList<Student>(Arrays.asList(students));
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
				
			}
			else{
				a.add(0,student);
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		ArrayList<Student> a = new ArrayList<Student>(Arrays.asList(students));
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
				
			}
			else{
				a.add(student);
			}
		}
		catch(Exception e)
		{
			System.out.println();
		}
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		  ArrayList<Student> a = new ArrayList<Student>(Arrays.asList(students));
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
				
			}
			else if (index<0||index>=students.length)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				a.add(index,student);
			}
			
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}

	@Override
	public void remove(int index) {
		  ArrayList<Student> a = new ArrayList<Student>(Arrays.asList(students));
		try{
			if(index<0||index>=students.length){
				throw new IllegalArgumentException();
				
			}
			else
			{
				a.remove(index);
			}
			
		}
		catch(Exception e)
		{
			System.out.println();
		}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
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
