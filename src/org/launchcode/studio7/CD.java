package org.launchcode.studio7;

public class CD extends OpticalDisc{
    public CD(String name, int storageCapacity) {
        super(name, storageCapacity);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public void playMusic(){
        if(isLoaded){
            System.out.println("\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5");
            System.out.println("\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5 Imagine your favorite music playing here.\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5");
            System.out.println("\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5");
        }
        else{
            System.out.println("ERROR: No CD found. Please load a CD.");
        }
    }

}
