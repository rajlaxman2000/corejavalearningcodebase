package interFaceAbstart2;

import corejava.Gingleton;


public class Sampletest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AnimlaInterface animlaInterface;
		
		animlaInterface =  giveNeedObject(1);
		
		System.out.println(animlaInterface.getSound("I really don't knwo which one I am calling"));
		
		HerbiVore herbiVore = new HerbiVore();
		
		herbiVore.reProductionMechanism("some sample");
		
		Reptiles reptiles = new Reptiles();
	
		reptiles.reProductionMechanism("reptiles");
		
	}
	
	public static AnimlaInterface giveNeedObject(int animalType){
		
		AnimlaInterface animlaInterface;
		
		if (animalType == 1 ){
			animlaInterface = new Mamals();			
		}else if(animalType ==2){
			animlaInterface = new HerbiVore();			
		}else{
			animlaInterface = new Reptiles();
		}
		
		return animlaInterface;
	}

}
