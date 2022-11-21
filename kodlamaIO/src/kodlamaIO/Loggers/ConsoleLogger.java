package kodlamaIO.Loggers;

import kodlamaIO.entities.Course;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Consol'a Loglandi"+" "+message);
		
	}

}
