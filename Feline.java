package com.animal;

public class Feline extends Animals{
protected boolean haveFurMarks;

public Feline(String name, String animalType, int numberOfLegs, String sexOfAnimal, boolean bornAtTheZoo,
		int howManyYearsAtTheZoo, boolean hasTail, boolean haveFurMarks) {
	super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail);
	this.haveFurMarks = haveFurMarks;
}

public boolean isHaveFurMarks() {
	return haveFurMarks;
}

public void setHaveFurMarks(boolean haveFurMarks) {
	this.haveFurMarks = haveFurMarks;
}

@Override
public String toString() {
	return "We saw a " + Name + " today. This feline is a " + animalType + ". It would be " + haveFurMarks + " to say that this feline has marks on its fur. Like all felines this cat has "
			+ numberOfLegs + " legs. The feline that was at the zoo today was a " + sexOfAnimal + ". It is very " + bornAtTheZoo
			+ " to say this feline was born in the zoo. This cat has lived at the zoo for " + howManyYearsAtTheZoo + " years and it would be " + hasTail + " to say this cat has a tail.";
}





}
