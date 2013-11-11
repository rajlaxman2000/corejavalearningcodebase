package interFaceAbstart2;

public class Mamals extends GenricAnimal implements AnimlaInterface {

	@Override
	public String getSound(String animalName) {
		String sound  = new String("I am souding like real mamal.");
		return sound;
	}

	@Override
	public String howItMOves(String animalName) {
		String move  = new String("I am Movingg like real mamal.");
		return move;
	}

	@Override
	public String eatingHabits(String animalName) {
		String eathabits  = new String("my eating habits are like mamals");
		return eathabits;
	}

	@Override
	public void myMthod(String name) {
		// TODO Auto-generated method stub
		
	}

	
}
