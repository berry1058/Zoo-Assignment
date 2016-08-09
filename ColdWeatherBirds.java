package com.animal;

public class ColdWeatherBirds extends Birds {

	private boolean fatherHatchesEgg;

	public ColdWeatherBirds(String name, String animalType, int numberOfLegs, String sexOfAnimal, boolean bornAtTheZoo,
			int howManyYearsAtTheZoo, boolean hasTail, boolean doTheyFly, boolean fatherHatchesEgg) {
		super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail, doTheyFly);
		this.fatherHatchesEgg = fatherHatchesEgg;
	}

	public boolean isFatherHatchesEgg() {
		return fatherHatchesEgg;
	}

	public void setFatherHatchesEgg(boolean fatherHatchesEgg) {
		this.fatherHatchesEgg = fatherHatchesEgg;
	}

	@Override
	public String toString() {
		return "We saw a  " +Name+" today at the zoo. It would be " + doTheyFly + "to say these birds can fly. These birds are "  + animalType + ". These type of birds have "
				+ numberOfLegs + ". The bird we saw today was a " + sexOfAnimal + ". The guild told us that it would be " + bornAtTheZoo
				+ " to say that this bird was born at the zoo. This bird has been in captivity for " + howManyYearsAtTheZoo + " years. It is safe to say that it is " + hasTail + " that this bird has a tail.";
	}

	
	
	
	
}
