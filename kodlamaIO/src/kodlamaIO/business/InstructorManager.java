package kodlamaIO.business;

import kodlamaIO.Loggers.Logger;
import kodlamaIO.dataAccess.InstructorDao;
import kodlamaIO.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao  _instructorDao;
	
	private Logger []  logger;
	
	

	public InstructorManager(InstructorDao _instructorDao, Logger[] logger) {
		
		this._instructorDao = _instructorDao;
		this.logger = logger;
	}



	public void instructorAdd(Instructor instructor) {
		_instructorDao.add(instructor);
		
		for (Logger logger2 : logger) {
			logger2.log(instructor.getInstructorName()+" "+instructor.getInstructorSurName());
		}
		
	}

}
