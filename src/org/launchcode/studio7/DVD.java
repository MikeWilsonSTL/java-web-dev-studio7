package org.launchcode.studio7;

public class DVD extends OpticalDisc{
    public DVD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public void playVideo(){
        if(isLoaded){
            System.out.println("|=====================[   Toshiba* Authentic TV   ]=======================|");
            System.out.println("|                                                                         |");
            System.out.println("|                                                                         |");
            System.out.println("| Just... imagine some awesome video playing here. My skills are limited. |");
            System.out.println("|                                                                         |");
            System.out.println("|                                                                         |");
            System.out.println("|==================[ *not really please don't sue :( ]====================|");
        }
        else{
            System.out.println("ERROR: No DVD loaded. Please load a DVD.");
        }
    }
}
