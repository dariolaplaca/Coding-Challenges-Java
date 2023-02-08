package Algorithms;

import java.util.ArrayList;
import java.util.Comparator;

public class InventoryUpdate {
    public static void main(String[] args) {
        InventoryUpdate inv = new InventoryUpdate();
        inv.Init();
    }

    public void Init(){
        Items myPotatoes = new Items("Potatoes", 3);
        Items myCarrots = new Items("Carrots", 1);
        Items myApples = new Items("Apples", 12);
        Items myArtichokes = new Items("Artichokes", 3);

        Items tomatoes = new Items("Tomatoes", 3);
        Items potatoes = new Items("Potatoes", 5);
        Items apples = new Items("Apples", 8);
        Items lettuce = new Items("Lettuce", 2);
        Items artichokes = new Items("Artichokes", 7);

        ArrayList<Items> myInventory = new ArrayList<>();
        ArrayList<Items> myNewInventory = new ArrayList<>();

        myInventory.add(myPotatoes);
        myInventory.add(myCarrots);
        myInventory.add(myApples);
        myInventory.add(myArtichokes);


        myNewInventory.add(tomatoes);
        myNewInventory.add(potatoes);
        myNewInventory.add(apples);
        myNewInventory.add(lettuce);
        myNewInventory.add(artichokes);

        ArrayList<Items> myFinalInventory = InvUpd(myInventory, myNewInventory);
        System.out.println(myFinalInventory);
    }

    public static class Items{
        int number;
        String name;
        Items(String name, int number){
            this.number = number;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return getName() + " " + getNumber();
        }
    }


    public static ArrayList<Items> InvUpd(ArrayList<Items> currentInventory, ArrayList<Items> newInventory){
        boolean hasItem;
        for(int i = 0; i < newInventory.toArray().length; i++){
            hasItem = false;
            for(int j = 0; j < currentInventory.toArray().length; j++){
                if(currentInventory.get(j).getName().equals(newInventory.get(i).getName())){
                    currentInventory.get(j).setNumber(currentInventory.get(j).getNumber() + newInventory.get(i).getNumber());
                    hasItem = true;
                }
            }
            if(!hasItem){
                currentInventory.add(newInventory.get(i));
            }
        }
        currentInventory.sort(Comparator.comparing(Items::getName));
        return currentInventory;
    }

}


