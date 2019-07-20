package org.elsys.gallery;

public class Sculpture implements PieceOfArt {
	private String artist;
	private String title;
	private int year;
	private double weight;
	private double price;

	public Sculpture(String artist, String title, int year, double weight, double price) {
		if ((year>=1000 && year<=2018) && weight > 0 && price > 0){
			this.artist = artist;
			this.title = title;
			this.year = year;
			this.weight = weight;
			this.price = price;
		}
		else{
			throw new RuntimeException();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elsys.gallery.PieceOfArt#getArtist()
	 */
	@Override
	public String getArtist() {
		return this.artist;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elsys.gallery.PieceOfArt#getTitle()
	 */
	@Override
	public String getTitle() {
		return this.title;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elsys.gallery.PieceOfArt#getYear()
	 */
	@Override
	public int getYear() {
		return this.year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.elsys.gallery.PieceOfArt#getPrice()
	 */
	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public double getWeigth() {
		return this.weight;
	}
}
