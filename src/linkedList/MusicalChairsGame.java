package linkedList;

public class MusicalChairsGame {

public static void main(String[] args) {
	
	MusicalChairs mc1 = new MusicalChairs("Leo", "Max", "Paul", "Anna");
	MusicalChairs mc2 = new MusicalChairs("Gabriel", "Elias");
	
	System.out.println(mc1);
	System.out.println(mc2);
	
	
	System.out.println(mc1.play());
	
	
	}
}
