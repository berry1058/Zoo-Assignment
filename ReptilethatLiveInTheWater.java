package com.animal;

public class ReptilethatLiveInTheWater extends Reptiles {
	private String whatTypeofWaterIsLivedIn;

	public ReptilethatLiveInTheWater(String name, String animalType, int numberOfLegs, String sexOfAnimal,
			boolean bornAtTheZoo, int howManyYearsAtTheZoo, boolean hasTail, boolean haveAnyLegs,
			String whatTypeofWaterIsLivedIn) {
		super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail, haveAnyLegs);
		this.whatTypeofWaterIsLivedIn = whatTypeofWaterIsLivedIn;
	}

	public String getWhatTypeofWaterIsLivedIn() {
		return whatTypeofWaterIsLivedIn;
	}

	public void setWhatTypeofWaterIsLivedIn(String whatTypeofWaterIsLivedIn) {
		this.whatTypeofWaterIsLivedIn = whatTypeofWaterIsLivedIn;
	}

	@Override
	public String toString() {
		return "We saw a " + Name + " today. This reptile is a " + animalType + ". It would be " + haveAnyLegs+ " to say that this reptiles has legs. Like all primates this cat has "
				+ numberOfLegs + " legs. The reptile that was at the zoo today was a " + sexOfAnimal + ". It is very " + bornAtTheZoo
				+ " to say this reptile was born in the zoo. This reptile has lived at the zoo for " + howManyYearsAtTheZoo + " years and it would be " + hasTail + " to say this reptile has a tail.";
	}
	}
	
	
	

