package Algorithms;

import java.util.ArrayList;
import java.util.Comparator;

public class InventoryUpdate {

    public static ArrayList<Items> InvUpd(ArrayList<Items> currentInventory, ArrayList<Items> newInventory){
        // Instantiating a boolean variable to check if our inventory already has the passed item
        boolean hasItem;
        // Iterating through the upcoming item's inventory
        for(int i = 0; i < newInventory.toArray().length; i++){
            hasItem = false;
            //Iterating through our inventory
            for(int j = 0; j < currentInventory.toArray().length; j++){
                //Checking if we already have the new item in our inventory by its name
                if(currentInventory.get(j).getName().equals(newInventory.get(i).getName())){
                    //If we have already the item we get the quantity of the item and we add it to the quantity in our inventory
                    currentInventory.get(j).setNumber(currentInventory.get(j).getNumber() + newInventory.get(i).getNumber());
                    hasItem = true;
                }
            }
            if(!hasItem){
                //If we don't have the item already we just add the whole item in our inventory
                currentInventory.add(newInventory.get(i));
            }
        }
        //We sort the final inventory by the item's name
        currentInventory.sort(Comparator.comparing(Items::getName));
        return currentInventory;
    }

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

    //Class for the Items that store the name and the number of items we have in the inventory
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
}


