package com.animal;

public class Animals {
protected String Name;
protected String animalType;
protected int numberOfLegs;
protected String sexOfAnimal;
protected boolean bornAtTheZoo;
protected int howManyYearsAtTheZoo;
protected boolean hasTail;
public Animals(String name, String animalType, int numberOfLegs, String sexOfAnimal, boolean bornAtTheZoo,
		int howManyYearsAtTheZoo, boolean hasTail) {
	super();
	Name = name;
	this.animalType = animalType;
	this.numberOfLegs = numberOfLegs;
	this.sexOfAnimal = sexOfAnimal;
	this.bornAtTheZoo = bornAtTheZoo;
	this.howManyYearsAtTheZoo = howManyYearsAtTheZoo;
	this.hasTail = hasTail;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAnimalType() {
	return animalType;
}
public void setAnimalType(String animalType) {
	this.animalType = animalType;
}
public int getNumberOfLegs() {
	return numberOfLegs;
}
public void setNumberOfLegs(int numberOfLegs) {
	this.numberOfLegs = numberOfLegs;
}
public String getSexOfAnimal() {
	return sexOfAnimal;
}
public void setSexOfAnimal(String sexOfAnimal) {
	this.sexOfAnimal = sexOfAnimal;
}
public boolean isBornAtTheZoo() {
	return bornAtTheZoo;
}
public void setBornAtTheZoo(boolean bornAtTheZoo) {
	this.bornAtTheZoo = bornAtTheZoo;
}
public int getHowManyYearsAtTheZoo() {
	return howManyYearsAtTheZoo;
}
public void setHowManyYearsAtTheZoo(int howManyYearsAtTheZoo) {
	this.howManyYearsAtTheZoo = howManyYearsAtTheZoo;
}
public boolean isHasTail() {
	return hasTail;
}
public void setHasTail(boolean hasTail) {
	this.hasTail = hasTail;
}
/*@Override
public String toString() {
	return "We saw a " + Name + ". This animal is a " + animalType + ". It has only " + numberOfLegs + " legs. The " + Name +
			" that was shown is a "+ sexOfAnimal + ". The zoo guide informed us that it would be " + bornAtTheZoo + " to say that they were born here. The " +Name + " had only been there for " + howManyYearsAtTheZoo
			+ " years. We were also asked if it was " + hasTail + " that the " +Name+ " has a tail.";
}*/



}