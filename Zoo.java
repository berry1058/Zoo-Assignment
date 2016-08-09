package com.animal;

import java.util.ArrayList;
import java.util.Arrays;

import com.people.Person;

public class Zoo {

	public static void main(String[] args) {
		ArrayList<Animals> theZoo = new ArrayList<>();
		
		Birds birdA = new Birds("Hawk", "Herbivore", 2, "male", false, 3, true, true);
		Birds birdB = new Birds("Eagle", "Carnivore", 2, "female", true, 5, true, true);
		Birds birdC = new Birds("Vulture", "canivore", 2, "male", false, 1, true, true);
		Feline felineA = new Feline("Lynx", "Carnivore", 4, "female", true, 6, true, false);
		Feline felineB = new Feline("Cheetah", "Carnivore", 4, "female", false, 6, true, true);
		Primate primateA = new Primate("Orangatang", "Carnivore", 2, "male", true, 7, false, true);
		Primate primateB = new Primate("Gorilla", "Carnivore", 2, "female", false, 7, false, false);
		Primate primateC = new Primate("Chimpanzee", "Carnivore", 2, "male", true, 3, false, false);
		Reptiles reptileA = new Reptiles("Crocodile", "Carnivore", 4, "male", false, 3, true, true);
		Reptiles reptileB = new Reptiles("Iguana", "Carnivore", 4, "female", false, 2, true, true);
		PrimatesThatAreCannibals PrimateCanA = new PrimatesThatAreCannibals("Bonobos", "Carnivore", 2, "male", false, 2, true, false, true, true);
		FlightLessBirds FlightBirdA = new FlightLessBirds("Pinguine", "Carnivore", 2, "female", true, 2, true, false, false);
		ReptilethatLiveInTheWater waterReptilesA = new ReptilethatLiveInTheWater("Alligator", "Carnivore", 4, "male", false, 8, true, true, "freshwater");
		ColdWeatherBirds ColdBirdA = new ColdWeatherBirds("Snow Owl", "Carnivore", 2, "male", true, 6, true, true, false);
		coldWeatherFeline coldFelineA = new coldWeatherFeline("Snow Tiger", "Carnivore", 4, "male", true, 5, true, true, true);
		
		
		theZoo.add(reptileA);
		theZoo.add(primateA);
		theZoo.add(felineA);
		theZoo.add(birdA);
		theZoo.add(reptileB);
		theZoo.add(primateB);
		theZoo.add(felineB);
		theZoo.add(birdB);
		theZoo.add(primateC);
		theZoo.add(birdC);
		theZoo.add(coldFelineA);
		theZoo.add(PrimateCanA);
		theZoo.add(waterReptilesA);
		theZoo.add(ColdBirdA);
		theZoo.add(FlightBirdA);
		
		
		System.out.println("When I went ot the zoo:");
		for(int i = 0; i < 15; i++){
			System.out.println(theZoo.get(i));
			System.out.println();
//		System.out.println(ArrayList.toString(Name));
	}
	
	}

}
