import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    int PipeSpeed = -4;
    
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() + PipeSpeed, getY());
        
        if (getX() == 0 || isTouching(FlappyBird.class)) {
            getWorld().removeObject(this);
        }
    }
}
