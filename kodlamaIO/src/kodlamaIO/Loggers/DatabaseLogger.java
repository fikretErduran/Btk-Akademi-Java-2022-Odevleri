package kodlamaIO.Loggers;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Database Loglandi"+" "+message);
		
	}
	
	

}
