import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ol extends Actor
{
    /**
     * Act - do whatever the ol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move (0) ;
        if(Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("up")){
            move(5);
        }
        if(Greenfoot.isKeyDown("down")){
            move(-5);
        }
            Actor bread = getOneObjectAtOffset(0,0,bread.class);
            if(bread !=null){
               getWorld().removeObject(bread);
               score.bread++;
               if(score.bread == 3){
                   getWorld().addObject(new win(),300,200);
                   Greenfoot.stop();
                }// Add your action code here.
    }    
}
}
