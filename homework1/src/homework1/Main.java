package homework1;

public class Main {

	public static void main(String[] args) {
		
		Courses course1 = new Courses("Programlamaya Giriþ için Temel Kurs", "Engin Demiroð");
		Courses course2 = new Courses("C#", "Engin Demiroð");
		Courses course3 = new Courses("Java", "Engin Demiroð");
		
		Courses[] courses = {course1,course2,course3};
		
		for(Courses course : courses) {
			System.out.println("Course name :"+course.name);
			System.out.println("Teacher name :"+course.teacherName);
			System.out.println("Content of Courses");
			
		}
		
		CoursesManager coursesmanager = new CoursesManager();
		coursesmanager.addTohomework2(course1);
		coursesmanager.updateTohomework2(course2);
	

}
}
