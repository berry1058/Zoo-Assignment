package com.animal;

public class PrimatesThatAreCannibals extends Primate {
private boolean eatTheYoung;
private boolean eatOtherPrimates;


public PrimatesThatAreCannibals(String name, String animalType, int numberOfLegs, String sexOfAnimal,
		boolean bornAtTheZoo, int howManyYearsAtTheZoo, boolean hasTail, boolean doTheyLiveInTrees, boolean eatTheYoung,
		boolean eatOtherPrimates) {
	super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail, doTheyLiveInTrees);
	this.eatTheYoung = eatTheYoung;
	this.eatOtherPrimates = eatOtherPrimates;
	
	
}


public boolean isEatTheYoung() {
	return eatTheYoung;
}


public void setEatTheYoung(boolean eatTheYoung) {
	this.eatTheYoung = eatTheYoung;
}


public boolean isEatOtherPrimates() {
	return eatOtherPrimates;
}


public void setEatOtherPrimates(boolean eatOtherPrimates) {
	this.eatOtherPrimates = eatOtherPrimates;
}


@Override
public String toString() {
	return "We saw a " + Name + " today. This primate is a " + animalType + ". It would be " + doTheyLiveInTrees + " to say that this primate lives in trees. Like all primates this cat has "
			+ numberOfLegs + " legs. The primate that was at the zoo today was a " + sexOfAnimal + ". It is very " + bornAtTheZoo
			+ " to say this primate was born in the zoo. This primate has lived at the zoo for " + howManyYearsAtTheZoo + " years and it would be " + hasTail + " to say this primate has a tail.";
}






}
