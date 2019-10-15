package show;

public class Drama implements Watchable {
	private int length;
	private String name;
	private String parentalRating;
	private String dramaCategory;
	
	public Drama(int length, String name, String parentalRating, String dramaCategory) {
		this.length = length;
		this.name = name;
		this.parentalRating = parentalRating;
		this.dramaCategory = dramaCategory;
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
	
	public String getDramaCategory() {
		return dramaCategory;
	}

}
