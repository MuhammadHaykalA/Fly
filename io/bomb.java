import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        if(getY()<=5 || getY()>=getWorld().getHeight()-5)
        turn(180);
        Actor ol= getOneObjectAtOffset(0,0,ol.class);
        if(ol!=null){
            removeTouching(ol.class);
            Greenfoot.stop();
            getWorld().addObject(new lose(),300,200);
        }// Add your action code here.
    }    
}
