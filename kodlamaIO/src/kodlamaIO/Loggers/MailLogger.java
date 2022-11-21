package kodlamaIO.Loggers;

public class MailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Mail  gonderildi  "+" "+" "+message);
		
	}

}
