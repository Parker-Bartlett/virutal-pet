package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import organicpets.Cat;
import organicpets.Dog;
import organicpets.OrganicPet;
import petshelter.VirtualPetShelter;
import roboticpets.Bender;
import roboticpets.RoboticPet;

public class VirtualPetShelterTest {
	@Test
	public void letsGoToTheShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();

	}

	@Test
	public void letsPutaDogInTheShelter() {
		VirtualPetShelter underTest = new VirtualPetShelter();

	}

	@Test
	public void returnListofanimals() {
		// act
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new Dog("Booker");
		underTest.addPet(underTestDog);
		int size = underTest.getLength();

		// arrange

		// assert
		assertEquals(1, size);

	}

	@Test
	public void shouldFeedAllPets() {
		// arrange
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new Dog("Booker");
		VirtualPet underTestCat = new Cat("Sam");
		underTest.addPet(underTestDog);
		underTest.addPet(underTestCat);

		// act
		underTest.feedAll();

		// assert
		assertEquals(30, underTestDog.getHunger());
		assertEquals(30, underTestCat.getHunger());

	}

	@Test
	public void shouldCleanAllPets() {
		// arrange
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new Dog("Booker");
		VirtualPet underTestCat = new Cat("Sam");
		underTest.addPet(underTestDog);
		underTest.addPet(underTestCat);

		// act
		underTest.cleanAll();

		// assert
		assertEquals(30, underTestDog.getCleanliness());
		assertEquals(30, underTestCat.getCleanliness());

	}

	@Test
	public void shouldHydrateAllPets() {
		// arrange
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new Dog("Booker");
		VirtualPet underTestCat = new Bender("Sam");
		underTest.addPet(underTestDog);
		underTest.addPet(underTestCat);

		// act
		underTest.hydrateAll();

		// assert
		assertEquals(30, ((OrganicPet) underTestDog).getThirst());
		assertEquals(30, ((RoboticPet) underTestCat).getLubrication());

	}

	@Test
	public void shouldPlayWithAllPets() {
		// arrange
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new Dog("Booker");
		VirtualPet underTestCat = new Cat("Sam");
		underTest.addPet(underTestDog);
		underTest.addPet(underTestCat);

		// act
		underTest.playAll();

		// assert
		assertEquals(30, underTestDog.getBoredom());
		assertEquals(30, underTestCat.getBoredom());
	}

	@Test
	public void shouldTickAll() {
		// arrange
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet underTestDog = new Dog("Booker");
		VirtualPet underTestCat = new Bender("Sam");
		underTest.addPet(underTestDog);
		underTest.addPet(underTestCat);
		
		underTest.tickAll();
		
		assertEquals(24, underTestDog.getHunger());
	}

}
