package com.animal;

public class Reptiles extends Animals {
protected boolean haveAnyLegs;

public Reptiles(String name, String animalType, int numberOfLegs, String sexOfAnimal, boolean bornAtTheZoo,
		int howManyYearsAtTheZoo, boolean hasTail, boolean haveAnyLegs) {
	super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail);
	this.haveAnyLegs = haveAnyLegs;
}

public boolean isHaveAnyLegs() {
	return haveAnyLegs;
}

public void setHaveAnyLegs(boolean haveAnyLegs) {
	this.haveAnyLegs = haveAnyLegs;
}

@Override
public String toString() {
	return "We saw a " + Name + " today. This reptile is a " + animalType + ". It would be " + haveAnyLegs+ " to say that this reptiles has legs. Like all primates this cat has "
			+ numberOfLegs + " legs. The reptile that was at the zoo today was a " + sexOfAnimal + ". It is very " + bornAtTheZoo
			+ " to say this reptile was born in the zoo. This reptile has lived at the zoo for " + howManyYearsAtTheZoo + " years and it would be " + hasTail + " to say this reptile has a tail.";
}

}
