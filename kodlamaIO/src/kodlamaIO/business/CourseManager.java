package kodlamaIO.business;

import java.util.ArrayList;

import kodlamaIO.Loggers.Logger;
import kodlamaIO.dataAccess.ICourseDao;
import kodlamaIO.entities.Course;

public class CourseManager {
	
	private ICourseDao iCourseDao;
	private Logger [] loggers;
	private ArrayList<Course> courseList =new ArrayList<>();
	
	
	public CourseManager(ICourseDao iCourseDao, Logger[] loggers) {
		
		this.iCourseDao = iCourseDao;
		this.loggers = loggers;
	}



	public void hesapla(Course course) throws Exception {
		for(Course c :courseList) {
			if(course.getCoursePrice()<=0) {
	  throw new  Exception("CoursePrice 10 dan kucuk olamaz");	
		}
	    
		
	  
	  if(course.getCourseName()==c.getCourseName()) {
		  System.out.println("Kurs adı tekrar edilemez");
	  }
	  iCourseDao.add(course);
	  for (Logger logger : loggers) {
		logger.log(course.getCourseName());
	}
	}
	  
	}
}
