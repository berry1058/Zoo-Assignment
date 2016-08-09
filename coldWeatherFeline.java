package com.animal;

public class coldWeatherFeline extends Feline{
private boolean dotheyLiveinSnow;

public coldWeatherFeline(String name, String animalType, int numberOfLegs, String sexOfAnimal, boolean bornAtTheZoo,
		int howManyYearsAtTheZoo, boolean hasTail, boolean haveFurMarks, boolean dotheyLiveinSnow) {
	super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail, haveFurMarks);
	this.dotheyLiveinSnow = dotheyLiveinSnow;
}

public boolean isDotheyLiveinSnow() {
	return dotheyLiveinSnow;
}

public void setDotheyLiveinSnow(boolean dotheyLiveinSnow) {
	this.dotheyLiveinSnow = dotheyLiveinSnow;
}

@Override
public String toString() {
	return "We saw a " + Name + " today. This feline is a " + animalType + ". It would be " + haveFurMarks + " to say that this feline has marks on its fur. Like all felines this cat has "
			+ numberOfLegs + " legs. The feline that was at the zoo today was a " + sexOfAnimal + ". It is very " + bornAtTheZoo
			+ " to say this feline was born in the zoo. This cat has lived at the zoo for " + howManyYearsAtTheZoo + " years and it would be " + hasTail + " to say this cat has a tail.";
}





}
