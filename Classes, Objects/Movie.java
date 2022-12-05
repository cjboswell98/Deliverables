
public class Movie {
	public String title;
	public String category;
	
	public Movie(String title, String category) {
		this.title = title; //set the field using the parameter value
		this.category = category; //"this." mean access the field
	}
	//no-args(arguments/parameters) constructor 
		public Movie() {
			//leaves all fields with the default value (i.e. null, 0, or false)
		}
}
