// Giuseppe Stramandinoli
// HW2
// Number 2

public class CourseTest
{

	public static void main(String[] args) 
	{
		Course scienceCourse = new Course();
		scienceCourse.load();
		scienceCourse.compute();
		scienceCourse.print();
		System.out.println();
		
		Course historyCourse = new Course();
		historyCourse.load();
		historyCourse.compute();
		historyCourse.print();		
	}

}
