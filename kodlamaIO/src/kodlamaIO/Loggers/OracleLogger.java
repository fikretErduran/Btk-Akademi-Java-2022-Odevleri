package kodlamaIO.Loggers;

public class OracleLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Oracle Loglandi"+" "+message);
		
	}

}
