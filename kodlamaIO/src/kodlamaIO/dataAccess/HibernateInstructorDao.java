package kodlamaIO.dataAccess;

import kodlamaIO.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate veri tabanina eklendi"+" "+instructor.getInstructorName()+" "+instructor.getInstructorSurName());
		
	}

}
