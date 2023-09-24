package ov2;

import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        //create three different classes for different gadgets
        //attributes include manufacturer, model, price
        //user must be able to get information about each gadget owner

       ArrayList<String> ownedby= new ArrayList<>();
        ownedby.add(("Abel"));
        ownedby.add(("Eva"));
        ownedby.add(("Gustav"));

       Owner belongsTo = new Owner(ownedby);

        Laptop Gadget1 = new Laptop("Dell", "XC79", 900);
        Smartwatch Gadget2 = new Smartwatch("Apple", "Watch Series 8", 399);
        Webcam Gadget3 = new Webcam("Elgato", "Facecam", 199);

        System.out.println(Gadget1 + " is owned by " + belongsTo.getOwnerByIndex(0));
        System.out.println(Gadget2 + " is owned by " + belongsTo.getOwnerByIndex(1));
        System.out.println(Gadget3 + " is owned by " + belongsTo.getOwnerByIndex(2));




    }
}




