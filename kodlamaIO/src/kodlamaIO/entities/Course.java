package kodlamaIO.entities;

public class Course {
  private int id;
  private String courseName;
  private String description;
  private String imageCourse;
  private double CoursePrice;
  
public Course() {
	
}

public Course(int id, String courseName, String description, String imageCourse,double CoursePrice) {
	
	this.id = id;
	this.courseName = courseName;
	this.description = description;
	this.imageCourse = imageCourse;
	this.CoursePrice=CoursePrice;
}



//Getter Setter

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getImageCourse() {
	return imageCourse;
}

public void setImageCourse(String imageCourse) {
	this.imageCourse = imageCourse;
}

public double getCoursePrice() {
	return CoursePrice;
}

public void setCoursePrice(double coursePrice) {
	CoursePrice = coursePrice;
}


  
  
  
}
