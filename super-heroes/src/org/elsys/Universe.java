package org.elsys;

import java.util.*;

public class Universe {
	private Map<SpecialPowersCharacter, Integer> mazalqk = new HashMap<>();
	private String name;
	private ArrayList<SuperVillain> deadVillian = new ArrayList<>();

	public Universe(String s){
		this.name = s;
	}

	public String getName()
	{
		return this.name;
	}

	public boolean addCharacter(SpecialPowersCharacter character) {
		if(mazalqk.keySet() == character){
			return false;
		}
		mazalqk.put(character, 0);
		return true;
	}

	public void beat(SuperHero hero, SuperVillain villain) {

		if(mazalqk.get(hero) != null && mazalqk.get(villain) != null){
			int score = mazalqk.get(hero) + 1;
			mazalqk.put(hero, score);


			if (mazalqk.get(hero) > mazalqk.get(villain)){
				System.out.println(villain.getName() + " was killed.");

				deadVillian.add(villain);
				mazalqk.remove(villain);
			}

		}


	}

	public Collection<SuperVillain> getDeadVillains() {
		if(deadVillian.size() == 0){
			throw new UniverseError("");
		}
		return deadVillian;
	}

	public int getScore(SpecialPowersCharacter character) {
		if(mazalqk.get(character) == null){
			throw new UniverseError("");
		}
		return mazalqk.get(character);
	}

	public void resurrectVillain(SuperVillain villain) {
		if (deadVillian.size() == 0){
			throw new UniverseError("");
		}
		mazalqk.put(villain, 0);



	}

	public SpecialPowersCharacter getTopCharacter() {
		SpecialPowersCharacter specialPowersCharacter = new SuperHero();
		int best=0;
		if(mazalqk.size() == 0){
			throw new UniverseError("");
		}
		if(mazalqk.keySet() == specialPowersCharacter){

		}
		return null;
	}

	public void actNasty(SuperVillain villain) {
		if(mazalqk.get(villain) == null){
			throw new UniverseError("");
		}
		int score = mazalqk.get(villain) + 1;
		mazalqk.put(villain, score);
	}

	public Map<Integer, List<SuperHero>> getHeroesByScore() {
		return null;
	}

	public List<String> getHeroesNamesOrderedByScore() {
		return null;
	}

	public Universe mergeWith(Universe other) {
		return null;
	}
}
