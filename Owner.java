package ov2;


import java.util.ArrayList;

public class Owner {

    // variable
    private ArrayList<String> ownedby= new ArrayList<>();

    public Owner(ArrayList<String> ownedby) {
        this.ownedby = ownedby;
    }

    public ArrayList<String> getOwnedby() {
        return ownedby;
    }

    public String getOwnerByIndex(int index) {
        if (index >= 0 && index < ownedby.size()) {
            return ownedby.get(index);
        }
        return null; // or throw an exception if you prefer
    }

    public void setOwnedby(ArrayList<String> ownedby) {
        this.ownedby = ownedby;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownedby=" + ownedby +
                '}';
    }
}





