package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;

public abstract class AbstractGallery {
    protected ArrayList<PieceOfArt> pictures;
    protected int budget;
    public int getBudget() {
        return this.budget;
    }
    public double getMonthlyCost() {
        double sum = 0;
        for(PieceOfArt sculpture : pictures){
            sum += sculpture.getPrice();
        }
        return sum*0.1;
    }
    public boolean add(PieceOfArt artWork) {
        if(this.pictures.size() == 0){
            pictures.add((Sculpture) artWork);
            return true;
        }
        for(PieceOfArt sculpture : pictures) {
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
    public boolean contains(PieceOfArt painting) {
        for(PieceOfArt sculpture : pictures) {
            if (sculpture.getTitle() == painting.getTitle() && sculpture.getArtist() == painting.getArtist() && sculpture.getYear() == painting.getYear()) {
                return true;
            }
        }
        return false;
    }
    public boolean monthlyPurchase(Collection<PieceOfArt> artWorks) {
        double bill=0.0;
        for (PieceOfArt arts : artWorks){
            bill += arts.getPrice();
        }
        if (this.budget >= bill){
            pictures.addAll(artWorks);
            this.budget -= bill;
            return true;
        }else{
            throw new RuntimeException();
        }

    }
}
