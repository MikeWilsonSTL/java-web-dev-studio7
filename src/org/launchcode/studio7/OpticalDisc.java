package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class OpticalDisc implements ReadWriteMemory{
    public double storageCapacity;
    public String name;
    public ArrayList<String> savedData = new ArrayList<>();
    public boolean isLoaded;
    public double storageUsed;

    public OpticalDisc(String name, double storageCapacity){
        this.name = name;
        this.storageCapacity = storageCapacity;
    }

    public void loadData(){
        System.out.println("Loaded disc: " + name + "\nTotal Capacity: " + storageCapacity + " MB\nUsed Memory: "
         + storageUsed);
        this.isLoaded = true;
    }

    public void writeData(String data){
        if(isLoaded){
            savedData.add(data);
            this.storageUsed += 5;
            System.out.println("Data successfully written to disk!\n");
        }
        else{
            System.out.println("ERROR: No disk found.\nPlease load an optical disc.");
        }
    }
}