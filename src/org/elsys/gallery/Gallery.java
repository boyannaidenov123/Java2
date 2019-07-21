package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;


public class Gallery extends AbstractGallery{


	public Gallery(int budget) {
		this.budget = budget;
		pictures = new ArrayList<>();
	}

	/**
	 *
	 * @return gallery budget.
	 */
	//public int getBudget() {return this.budget;}



	/**
	 * Montly cost for running the gallery - 10% of the total price of all
	 * art works.
	 * 
	 * @return
	 */
	/*public double getMonthlyCost() {
		double sum = 0;
		for(PieceOfArt sculpture : pictures){
			sum += sculpture.getPrice();
		}
		return sum*0.1;
	}*/

	/**
	 * Calculates the monthly budget that could be spend on buying new art works.
	 * 
	 * @return
	 */
	public double getRemainingMonthlyBudget() {
		return 1.0;
	}

	/**
	 * Add art works to the gallery collection.
	 * 
	 * If there is a piece of art in gallery collection with the same author, name and
	 * year of creation,
	 * throws RuntimeException because of forgery suspected.
	 * 
	 * @param artWork
	 *            - piece of art to be added
	 * @return true if p was successfully added, false otherwise.
	 */



	
	public int size() {
		return pictures.size();
	}
	
	/**
	 * If there is a painting in gallery collection with the same year, artist and title,
	 * returns true. Otherwise returns false
	 * 
	 * @param painting
	 * @return
	 */


	/**
	 * Returns collection of works from the gallery, which weight is between
	 * minWeight and maxWeight.
	 * 
	 * @param minWeight
	 * @param maxWeight
	 * @return
	 */
	public Collection<PieceOfArt> getWorksByWeight(double minWeight, double maxWeight) {
		ArrayList<PieceOfArt> pieceOfArts = new ArrayList<>();
		for (PieceOfArt sculpture : pictures){
			if(sculpture.getWeigth()>=minWeight && sculpture.getWeigth()<=maxWeight){
				pieceOfArts.add(sculpture);
			}
		}
		return pieceOfArts;
	}
}
