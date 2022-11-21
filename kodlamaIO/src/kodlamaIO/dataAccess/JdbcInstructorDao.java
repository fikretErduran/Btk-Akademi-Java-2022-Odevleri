package kodlamaIO.dataAccess;

import kodlamaIO.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veri tabanina eklendi instructor: " +"  "+ instructor.getInstructorName()+
				instructor.getInstructorSurName());
		
	}

}
