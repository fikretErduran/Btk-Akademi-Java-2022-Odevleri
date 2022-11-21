package kodlamaIO;

import kodlamaIO.Loggers.ConsoleLogger;
import kodlamaIO.Loggers.DatabaseLogger;
import kodlamaIO.Loggers.Logger;
import kodlamaIO.Loggers.MailLogger;
import kodlamaIO.Loggers.OracleLogger;
import kodlamaIO.business.CategoryManager;
import kodlamaIO.business.CourseManager;
import kodlamaIO.business.InstructorManager;
import kodlamaIO.dataAccess.HibernateCourseDao;
import kodlamaIO.dataAccess.HibernateInstructorDao;
import kodlamaIO.dataAccess.JdbcCategoryDao;
import kodlamaIO.dataAccess.JdbcCourseDal;
import kodlamaIO.dataAccess.JdbcInstructorDao;
import kodlamaIO.entities.Category;
import kodlamaIO.entities.Course;
import kodlamaIO.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception   {
	
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("FrontEnd Yazilim ");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setCategoryName("BackEnd Yazilim");
		
		
		Course course1 =new Course();
		course1.setId(1);
		course1.setCourseName("(2022) Yazilim Gelistirici Yetistirme Kampi - JAVA");
		course1.setDescription("java uygulamali gerçek hayat orneklendirmeleri ile egitim");
		course1.setImageCourse("kodlama_io.jpg");
		course1.setCoursePrice(2500);
		
		
		Course course2 =new Course();
		course2.setId(2);
		course2.setCourseName("Yazilim Gelistirici Yetistirme Kampi ");
		course2.setDescription("(C# + ANGULAR)");
		course2.setImageCourse("kodlama_io.jpg");
		course2.setCoursePrice(3000);
		
		Course course3 =new Course();
		course3.setId(3);
		course3.setCourseName("Senior Yazilim Gelistirici Yetiştirme Kampi");
		course3.setDescription("ileri seviye proglamlama");
		course3.setImageCourse("kodlama_io.jpg");
		course3.setCoursePrice(1750);
		
		Course course4 =new Course();
		course4.setId(4);
		course4.setCourseName("Yazilim Gelistirici Yetistirme Kampi (JavaScript)");
		course4.setDescription("(JavaScript)");
		course4.setImageCourse("kodlama_io.jpg");
		course4.setCoursePrice(4000);
		
		Course course5 =new Course();
		course5.setId(5);
		course5.setCourseName("Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)");
		course5.setDescription("(JAVA + REACT)");
		course5.setImageCourse("kodlama_io.jpg");
		course5.setCoursePrice(2850);
		
		Course course6 =new Course();
		course6.setId(6);
		course6.setCourseName("Programlamaya Giris İçin Temel Kurs");
		course6.setDescription("PYTHON, JAVA  C#  temel programlama mantigini anlasilir orneklerle oğrenin");
		course6.setImageCourse("kodlama_io.jpg");
		course6.setCoursePrice(5500);
		
		Instructor instructor=new Instructor();
		instructor.setId(10034);
		instructor.setInstructorName("Engin");
		instructor.setInstructorSurName("Demirog");

		
		Logger[] loggers= {new ConsoleLogger(),new DatabaseLogger(),new MailLogger(),
				new OracleLogger()};
		
		
		CategoryManager  categoryManager=new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		
		
		
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
	
		    courseManager.hesapla(course1);
		    courseManager.hesapla(course2);
		    courseManager.hesapla(course3);
		    courseManager.hesapla(course4);
		    courseManager.hesapla(course5);
		    courseManager.hesapla(course6);
		  
		    
 InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(), loggers);
       instructorManager.instructorAdd(instructor);
	}

}

 