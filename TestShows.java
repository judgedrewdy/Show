package show;

public class TestShows {

	public static void main(String[] args) {
		Drama LawandOrder = new Drama(44, "Law and Order", "TV-14", "CopShow");
		Sitcom Seinfeld = new Sitcom(22, "Seinfeld", "PG", true);
		Sports MondayNightFootball = new Sports(210, "Monday Night Football", "G", "Football");
		
		System.out.println("The show " + LawandOrder.getName() + " is " + LawandOrder.getLength() + " minutes long, is rated " + LawandOrder.getParentalRating() + " and is in the category of " + LawandOrder.getDramaCategory() + ".");
		System.out.println("The show " + Seinfeld.getName() + " is " + Seinfeld.getLength() + " minutes long, is rated " + Seinfeld.getParentalRating() + " and does it has a laugh track: " + Seinfeld.hasLaughTrack() + ".");
		System.out.println("The show " + MondayNightFootball.getName() + " is " + MondayNightFootball.getLength() + " minutes long, is rated " + MondayNightFootball.getParentalRating() + " and is of type: " + MondayNightFootball.getType() + ".");
	}

}
