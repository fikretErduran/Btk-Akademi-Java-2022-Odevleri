package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class HibernateCourseDao implements ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate veritabanina eklendi Course Fiyati:"+" "+course.getCoursePrice());
		
	}

}
