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
    }
}
