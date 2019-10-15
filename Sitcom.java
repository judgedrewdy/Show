package show;

public class Sitcom implements Watchable{
	private int length;
	private String name;
	private String parentalRating;
	private boolean laughTrack;
	
	public Sitcom(int length, String name, String parentalRating, boolean laughTrack) {
		this.length = length;
		this.name = name;
		this.parentalRating = parentalRating;
		this.laughTrack = laughTrack;
	}
	
	@Override
	public int getLength() {
	
		return length;
	}

	@Override
	public void setLength(int length) {
		this.length = length;
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getParentalRating() {
		return parentalRating;
	}
	
	public boolean hasLaughTrack() {
		return laughTrack;
	}

}
