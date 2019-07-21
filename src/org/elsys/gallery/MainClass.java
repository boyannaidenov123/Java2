package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        List<PieceOfArt> sculptures = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String line = "";
        while (input.hasNext()){
            String artist, title;
            int year, weight, price;
            String next = "";

            next = input.next();
            artist = next.substring(0, next.length()-1);

            next = input.next();
            title = next.substring(0, next.length()-1);

            next = input.next();
            year = Integer.parseInt(next.substring(0, next.length()-1));

            next = input.next();
            weight = Integer.parseInt(next.substring(0, next.length()-1));

            next = input.next();
            price = Integer.parseInt(next.substring(0, next.length()-1));


            if(year >= 1000){
                Sculpture sculpture = new Sculpture(artist,title,year, weight, price);
                sculptures.add(sculpture);
            }

            System.out.println(artist);
            System.out.println(title);
            System.out.println(year);
            System.out.println(weight);
            System.out.println(price);

        }
        ModernGallery modernGallery = new ModernGallery(5000);
        try{
            modernGallery.monthlyPurchase(sculptures);
        }catch (RuntimeException e){
            System.out.println("I caught: " + e);
        }

        System.out.println(modernGallery.size()+", budget: "+ modernGallery.getBudget());
        modernGallery.getWorksOf("Artist1");


        /*int n;
        String str = "123;";
        str = str.substring(0, str.length()-1);
        n = Integer.parseInt(str);
        System.out.println(n);*/
































        /*Sculpture sculpture1 = new Sculpture("az", "nz", 1000, 10, 100);
        Sculpture sculpture2 = new Sculpture("az2", "nz", 1000, 10, 10);
        Sculpture sculpture3 = new Sculpture("az3", "nz", 1000, 10, 10);
        Sculpture sculpture4 = new Sculpture("az4", "nz", 1000, 10, 10);
for(int i=0; i<5; i++){
                System.out.println(parts[i]);
            }

        Gallery gallery = new Gallery(103);
        gallery.add(sculpture1);
        gallery.add(sculpture2);
        gallery.add(sculpture3);
        gallery.add(sculpture4);

        Sculpture sculpture5 = new Sculpture("az5", "nz", 1800, 100, 100);
        Sculpture sculpture6 = new Sculpture("az5", "nz", 2000, 100, 32);
        Sculpture sculpture7 = new Sculpture("az7", "nz", 2000, 666, 10);
        Sculpture sculpture8 = new Sculpture("az8", "nz", 1000, 100, 10);
        ArrayList<PieceOfArt> sculptures = new ArrayList<>();
        sculptures.add(sculpture5);
        sculptures.add(sculpture6);
        sculptures.add(sculpture7);
        sculptures.add(sculpture8);

        gallery.addAll(sculptures);

        ModernGallery modernGallery = new ModernGallery(1000);
        modernGallery.add(sculpture5);
        modernGallery.add(sculpture6);
        modernGallery.add(sculpture7);

        ArrayList<PieceOfArt> pieceOfArts = new ArrayList<>();
        pieceOfArts.addAll(modernGallery.getWorksOf("az7"));
        for (PieceOfArt pieceOfArt : pieceOfArts){
            System.out.println(pieceOfArt.getArtist()+ ", "+ pieceOfArt.getTitle()+", "+pieceOfArt.getPrice());
        }
        //System.out.println();*/




    }

}
