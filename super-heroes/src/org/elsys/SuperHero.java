package org.elsys;

public class SuperHero extends AbstractSuper {

	protected SuperVillain antagonist;

	public SuperVillain getAntagonist() {
		return this.antagonist;
	}

	@Override
	public void act() {
		if(this.getUniverse() == null){
			throw new UniverseError("No universe");
		}
		System.out.println(this.getName() + " will act.");
		this.getUniverse().beat(this, this.getAntagonist());
		System.out.println(this.getName() + " will now have some rest.");
	}
}
