
public class Greeter {
	//field
	String greeting;
	
	public void setGreeting(String greeting) {
		//setter
		this.greeting = greeting;
	}
	
	public String getGreeting() {
		//getter
		return greeting;
	}

	public String greet(String name) {
		return greeting + " " + name + "!";
	}
	//constructor
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
}
