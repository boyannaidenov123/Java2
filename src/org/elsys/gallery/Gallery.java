package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Gallery extends AbstractGallery{

	public ArrayList<Sculpture> getPictures() {
		return pictures;
	}

	public void setPictures(ArrayList<Sculpture> pictures) {
		this.pictures = pictures;
	}

	private ArrayList<Sculpture> pictures;
	private int budget;
	public Gallery(int budget) {
		this.budget = budget;
		pictures = new ArrayList<>();
	}

	/**
	 *
	 * @return gallery budget.
	 */
	public int getBudget() {
		return this.budget;
	}

	/**
	 * Montly cost for running the gallery - 10% of the total price of all
	 * art works.
	 * 
	 * @return
	 */
	public double getMonthlyCost() {
		double sum = 0;
		for(Sculpture sculpture : pictures){
			sum += sculpture.getPrice();
		}
		return sum/0.1;
	}

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
	public boolean add(PieceOfArt artWork) {
		if(this.pictures.size() == 0){
			pictures.add((Sculpture) artWork);
			return true;
		}
		for(Sculpture sculpture : pictures) {
			if (contains((Sculpture) artWork)) {
				throw new RuntimeException();
			}
		}
		pictures.add((Sculpture) artWork);
		return true;
	}

	public boolean addAll(Collection<PieceOfArt> artWorks) {
		if (pictures.size() == 0) {
			for (PieceOfArt sculpture : artWorks) {
				pictures.add((Sculpture) sculpture);
			}
			return true;
		}
		for (PieceOfArt sculptureToAdd : artWorks) {
			if (contains((Sculpture) sculptureToAdd)) {
				throw new RuntimeException();
			}
		}

		for(PieceOfArt sculpture : artWorks){
			pictures.add((Sculpture) sculpture);
		}
		return true;
	}

	public boolean monthlyPurchase(Collection<PieceOfArt> artWorks) {
		double bill=0.0;
		for (PieceOfArt arts : artWorks){
			bill += arts.getPrice();
		}
		if (budget >= bill){
			return true;
		}
		throw new RuntimeException();
	}
	
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
	public boolean contains(PieceOfArt painting) {
		for(Sculpture sculpture : pictures) {
			if (sculpture.getTitle() == painting.getTitle() && sculpture.getArtist() == painting.getArtist() && sculpture.getYear() == painting.getYear()) {
				return true;
			}
		}
		return false;
	}

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
		for (Sculpture sculpture : pictures){
			if(sculpture.getWeigth()>=minWeight && sculpture.getWeigth()<=maxWeight){
				pieceOfArts.add(sculpture);
			}
		}
		return pieceOfArts;
	}
}
