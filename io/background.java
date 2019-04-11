import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bomb bomb = new bomb();
        addObject(bomb,128,39);
        bomb.setRotation(90);
        bomb bomb2 = new bomb();
        addObject(bomb2,292,364);
        bomb2.setRotation(90);
        bomb bomb3 = new bomb();
        addObject(bomb3,492,278);
        bomb3.setRotation(90);
        bomb.setLocation(160,49);
        ol ol = new ol();
        addObject(ol,39,197);
        bread bread = new bread();
        addObject(bread,236,220);
        bread bread2 = new bread();
        addObject(bread2,384,100);
        bread bread3 = new bread();
        addObject(bread3,571,231);
        bread bread4 = new bread();
        addObject(bread4,76,335);
        bread bread5 = new bread();
        addObject(bread5,498,366);
        bread bread6 = new bread();
        addObject(bread6,170,121);
        bread bread7 = new bread();
        addObject(bread7,294,46);
        bread bread8 = new bread();
        addObject(bread8,482,54);
        bread bread9 = new bread();
        addObject(bread9,397,284);
    }
}
