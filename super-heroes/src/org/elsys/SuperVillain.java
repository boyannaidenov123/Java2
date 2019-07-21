package org.elsys;

public class SuperVillain extends AbstractSuper {

	@Override
	public void act() {
		if(this.getUniverse() == null){
			throw new UniverseError("No universe");
		}
		System.out.println(this.getName() + " will act.");
		System.out.println(this.getName() + " does nasty things! (evil laugh)");
		this.getUniverse().actNasty(this);
		System.out.println(this.getName() + " will now have some rest.");

	}

}
