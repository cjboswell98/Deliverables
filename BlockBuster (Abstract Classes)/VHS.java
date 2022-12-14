
public class VHS extends Movie {

	public VHS(String title, int runTime) {
		super();
		this.title = title;
		this.runTime = runTime;
	}


	public double getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(double currentTime) {
		this.currentTime = currentTime;
	}


	private double currentTime = 0;
	

	public void rewind() {
		currentTime = 0;
	}

	@Override
	public void play() {
		System.out.println("Current Time: " + currentTime);
		currentTime++;
		for(int i = 0; i < runTime; i++) {
			if(currentTime > runTime) {
				rewind();
			} else {
				break;
			}
		}
	}	
}
