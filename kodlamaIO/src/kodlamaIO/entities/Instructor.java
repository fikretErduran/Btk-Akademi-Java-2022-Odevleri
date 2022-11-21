package kodlamaIO.entities;

public class Instructor {

	private int id;
	private String InstructorName;
	private String InstructorSurName;
	
	public Instructor() {
		super();
	}

	public Instructor(int id, String instructorName, String instructorSurName) {
		super();
		this.id = id;
		InstructorName = instructorName;
		InstructorSurName = instructorSurName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstructorName() {
		return InstructorName;
	}

	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}

	public String getInstructorSurName() {
		return InstructorSurName;
	}

	public void setInstructorSurName(String instructorSurName) {
		InstructorSurName = instructorSurName;
	}
	
	
	
	
}
