package kodlamaIO.dataAccess;

import kodlamaIO.entities.Course;

public class JdbcCourseDal implements ICourseDao{

	@Override
	public void add(Course course) {
	  System.out.println("Jdbc ile veri tabanina eklendi course fiyati:"+" "+" "+course.getCoursePrice());
		
	}

}
