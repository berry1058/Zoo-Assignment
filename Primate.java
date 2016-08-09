package com.animal;

public class Primate extends Animals {

protected boolean doTheyLiveInTrees;

public Primate(String name, String animalType, int numberOfLegs, String sexOfAnimal, boolean bornAtTheZoo,
		int howManyYearsAtTheZoo, boolean hasTail, boolean doTheyLiveInTrees) {
	super(name, animalType, numberOfLegs, sexOfAnimal, bornAtTheZoo, howManyYearsAtTheZoo, hasTail);
	this.doTheyLiveInTrees = doTheyLiveInTrees;
}

public boolean isDoTheyLiveInTrees() {
	return doTheyLiveInTrees;
}

public void setDoTheyLiveInTrees(boolean doTheyLiveInTrees) {
	this.doTheyLiveInTrees = doTheyLiveInTrees;
}

@Override
public String toString() {
	return "We saw a " + Name + " today. This primate is a " + animalType + ". It would be " + doTheyLiveInTrees + " to say that this primate lives in trees. Like all primates this cat has "
			+ numberOfLegs + " legs. The primate that was at the zoo today was a " + sexOfAnimal + ". It is very " + bornAtTheZoo
			+ " to say this primate was born in the zoo. This primate has lived at the zoo for " + howManyYearsAtTheZoo + " years and it would be " + hasTail + " to say this primate has a tail.";
}



}