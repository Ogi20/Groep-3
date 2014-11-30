import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game1 extends World
{

    /**
     * Constructor for objects of class game1.
     * 
     */
    public game1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        BoatSmall boatsmall = new BoatSmall();
        addObject(boatsmall, 424, 88);
        Dock1 dock1 = new Dock1();
        addObject(dock1, 231, 748);
        dock1.setLocation(246, 755);
        Dock2 dock2 = new Dock2();
        addObject(dock2, 505, 757);
        dock2.setLocation(508, 754);
        Dock5 dock5 = new Dock5();
        addObject(dock5, 753, 182);
        Dock4 dock4 = new Dock4();
        addObject(dock4, 758, 318);
        Dock3 dock3 = new Dock3();
        addObject(dock3, 753, 500);

        dock3.setLocation(626, 506);
        dock4.setLocation(628, 319);
        dock5.setLocation(627, 145);
        removeObject(boatsmall);
        dock2.setLocation(487, 691);
        dock1.setLocation(239, 676);
        dock2.setLocation(469, 676);
        Havenfoot2 havenfoot2 = new Havenfoot2();
        addObject(havenfoot2, 762, 398);
        havenfoot2.setLocation(761, 398);
        Haven haven = new Haven();
        addObject(haven, 395, 765);
        haven.setLocation(400, 765);
        dock3.setLocation(671, 507);
        dock4.setLocation(672, 304);
        dock5.setLocation(672, 113);
    }
}
