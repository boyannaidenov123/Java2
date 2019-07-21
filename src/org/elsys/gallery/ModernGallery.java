package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;

public class ModernGallery extends Gallery {

	public ModernGallery(int budget) {
		super(budget);
	}

	@Override
	public boolean add(PieceOfArt artWork) {
		if(artWork.getYear()<1800){
			throw new RuntimeException();
		}else {
			return super.add(artWork);
		}
	}

	@Override
	public boolean addAll(Collection<PieceOfArt> artWorks) {
		for(PieceOfArt pieceOfArt : artWorks){
			if(pieceOfArt.getYear() < 1800){
				throw new RuntimeException();
			}
		}
		return super.addAll(artWorks);
	}

	@Override
	public double getMonthlyCost() {
		return super.getMonthlyCost()*0.8;
	}

	/**
	 * Montly cost for running the gallery - 8% of the total price of all paintings.
	 * 
	 * @return
	 */
	/*public double getMonthlyCost() {
		double sum = 0;
		for(PieceOfArt sculpture : pictures){
			sum += sculpture.getPrice();
		}
		return sum * 0.08;
	}*/

	@Override
	public boolean monthlyPurchase(Collection<PieceOfArt> artWorks) {
		for(PieceOfArt pieceOfArt : artWorks){
			if(pieceOfArt.getYear() < 1800){
				throw new RuntimeException();
			}
		}
		return super.monthlyPurchase(artWorks);
	}



	/**
	 * Returns all art works of the given artist sorted from the most expensive to
	 * the less expensive painting.
	 * @param artist
	 * @return
	 */
	public Collection<PieceOfArt> getWorksOf(String artist) {
		ArrayList<PieceOfArt> pieceOfArts = new ArrayList<>();
		for (PieceOfArt pieceOfArt: pictures){
			if (pieceOfArt.getArtist() == artist){
				pieceOfArts.add(pieceOfArt);
			}
		}

		return pieceOfArts;
	}
}
