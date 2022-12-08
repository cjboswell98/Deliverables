
public class Greeter {
	String greeting;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		return greeting;
	}

	public String greet(String name) {
		return greeting + name + "!";
	}
	public Greeter() {
		
	}
}
