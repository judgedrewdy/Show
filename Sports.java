package show;

public class Sports implements Categorizable{
	private int length;
	private String name;
	private String parentalRating;
	private String type;
	
	public Sports(int length, String name, String parentalRating, String type) {
		this.length = length;
		this.name = name;
		this.parentalRating = parentalRating;
		this.type = type;
	}
	
	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public void setLength(int length) {
		// TODO Auto-generated method stub
		this.length = length;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getParentalRating() {
		// TODO Auto-generated method stub
		return parentalRating;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
		
	}

}
