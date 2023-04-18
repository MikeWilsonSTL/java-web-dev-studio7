package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("My test CD", 64);
        DVD dvd = new DVD("My test DVD", 256);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println("LOAD DATA:");
        cd.loadData();
        dvd.loadData();

        System.out.println("WRITE DATA:");
        cd.writeData("first data entry");

        System.out.println("LOAD DATA AGAIN: ");
        cd.loadData();

        cd.playMusic();
        dvd.playVideo();
    }
}
