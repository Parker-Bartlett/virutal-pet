package virtualpet;

import java.lang.reflect.Array;
import java.util.HashMap;

public class VirtualPetShelter {

	private HashMap<String, VirtualPet> list = new HashMap<String, VirtualPet>();

	public VirtualPetShelter() {

	}// closer petshelter method

	/**
	 * 
	 * @param pet
	 */
	// Adds pet to the list
	public void addPet(VirtualPet pet) {
		list.put(pet.getName(), pet);

	}
	
	public boolean checkIfListContains(String name) {
		if (list.containsKey(name)) {
			return true;
		}
		return false;
	}

	public VirtualPet getPet(String petToGet) {
		return list.get(petToGet);
	}

	public void removePet(VirtualPet pet) {
		list.remove(pet.getName());
	}

	// Return size of the HashMap
	public int getLength() {
		return list.size();
	}

	public void feedAll() {
		for (VirtualPet pet : list.values()) {
			pet.feed();
		}
	}

	public void cleanAll() {
		for (VirtualPet pet : list.values()) {
			pet.clean();
		}
	}

	public void hydrateAll() {
		for (VirtualPet pet : list.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).hydrate();
			}
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).lubricate();
			}
		}
	}

	public void playAll() {
		for (VirtualPet pet : list.values()) {
			pet.play();
		}
	}

	public void tickAll() {
		for (VirtualPet pet : list.values()) {
			pet.tick();
		}
	}

	public void listPets() {
		for (VirtualPet pet : list.values()) {
			if (pet instanceof OrganicPet) {
				System.out.println("Organic Pet - Name: " + pet.getName());
			}
			if (pet instanceof RoboticPet) {
				System.out.println("Robotic Pet - Name:" + pet.getName());
			}
		}
	}

	public void statusOfAllPets() {
		for (VirtualPet pet : list.values()) {
			System.out.println(pet.printStats() + "\n");
		}
	}

}// close class