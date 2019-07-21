package org.elsys;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String unName = input.next();
        Universe universe = Factory.createUniverse(unName);
        while (input.hasNext()){
            String hero = input.next();
            if(hero.equals("END")){
                break;
            }
            hero = hero.substring(0, hero.length()-1);
            String villian = input.next();
            System.out.println(hero + " - " + villian);


            SuperVillain villain1 = Factory.createSuperVillain(villian);
            SuperHero hero1 = Factory.createSuperHero(hero, villain1);

        }
        while (input.hasNext()){
            String hero = input.next();
            String action = input.next();
            java.lang.reflect.Method method;
            try{
                //method = hero.getClass().getMethod(action);
            }catch (SecurityException e){
                throw new SecurityException();
            }
        }

    }
}
