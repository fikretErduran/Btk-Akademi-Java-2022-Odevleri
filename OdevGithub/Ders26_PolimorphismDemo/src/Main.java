
public class Main {

	public static void main(String[] args) {
		//EmailLogger emailLogger=new EmailLogger();
		//emailLogger.log("E mail Logger Message");
    // BaseLogger [] loggers = new BaseLogger [] {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
     //  for (BaseLogger logger:loggers) {
    	//   logger.log("log Mesaji");
      // }
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
