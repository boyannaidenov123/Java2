package org.elsys;

public class Factory
{

	public static SuperHero createSuperHero(String name, SuperVillain antagonist) {
		SuperHero superHero = new SuperHero();
		superHero.isGood = true;
		superHero.name = name;
		superHero.antagonist = antagonist;
		superHero.universe = null;

		return superHero;
	}

	public static SuperVillain createSuperVillain(String name) {
		SuperVillain superVillain = new SuperVillain();
		superVillain.isGood = false;
		superVillain.name = name;
		superVillain.universe = null;


		return superVillain;
	}

	public static Universe createUniverse(String name) {
		Universe universe = new Universe(name);
		return universe;
	}
}
