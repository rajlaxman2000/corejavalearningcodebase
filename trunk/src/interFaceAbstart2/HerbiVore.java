package interFaceAbstart2;

public class HerbiVore extends GenricAnimal implements AnimlaInterface {

	@Override
	public String getSound(String animalName) {
		String sound  = new String("I am souding like Herbivores.");
		return sound;
	}

	@Override
	public String howItMOves(String animalName) {
		String move  = new String("we will move like herbivores.");
		return move;
	}

	@Override
	public String eatingHabits(String animalName) {
		String eathabits  = new String("We have herbivires eating habits");
		return eathabits;
	}
	
	public void reProductionMechanism(String animalType ){
		System.out.println("This is will be having kids");
	}

	@Override
	public void myMthod(String name) {
		// TODO Auto-generated method stub
		
	}
}
