package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;

public class ModernGallery extends Gallery AbstractGallery{

	private ArrayList<Sculpture> pictures = new ArrayList<>();

	public ModernGallery(int budget) {
		super(budget);
	}

	public boolean add(PieceOfArt artWork) {
		return true;
	}
	
	/**
	 * Montly cost for running the gallery - 8% of the total price of all paintings.
	 * 
	 * @return
	 */
	public double getMonthlyCost() {
		double sum = 0;
		for(Sculpture sculpture : pictures){
			sum += sculpture.getPrice();
		}
		return sum * 0.08;
	}

	public boolean monthlyPurchase(Collection<PieceOfArt> paintings) {
		return true;
	}

	/**
	 * Returns all art works of the given artist sorted from the most expensive to
	 * the less expensive painting.
	 * @param artist
	 * @return
	 */
	/*public Collection<PieceOfArt> getWorksOf(String artist) {
	}*/
}
