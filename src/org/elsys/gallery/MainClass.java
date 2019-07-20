package org.elsys.gallery;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass {
    public static void main(String[] args) {
        Sculpture sculpture1 = new Sculpture("az", "nz", 1000, 10, 100);
        Sculpture sculpture2 = new Sculpture("az2", "nz", 1000, 10, 10);
        Sculpture sculpture3 = new Sculpture("az3", "nz", 1000, 10, 10);
        Sculpture sculpture4 = new Sculpture("az4", "nz", 1000, 10, 10);


        Gallery gallery = new Gallery(100);
        gallery.add(sculpture1);
        gallery.add(sculpture2);
        gallery.add(sculpture3);
        gallery.add(sculpture4);

        Sculpture sculpture5 = new Sculpture("az5", "nz", 1000, 100, 100);
        Sculpture sculpture6 = new Sculpture("az6", "nz", 1000, 100, 10);
        Sculpture sculpture7 = new Sculpture("az7", "nz", 1000, 100, 10);
        Sculpture sculpture8 = new Sculpture("az8", "nz", 1000, 100, 10);
        ArrayList<PieceOfArt> sculptures = new ArrayList<>();
        sculptures.add(sculpture5);
        sculptures.add(sculpture6);
        sculptures.add(sculpture7);
        sculptures.add(sculpture8);

        gallery.addAll(sculptures);


        System.out.println(gallery.getWorksByWeight(100, 100).size());
        //System.out.println();




    }

}
