import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PipeUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PipeUp extends Actor
{
    int PipeSpeed = -4;
    
    /**
     * Act - do whatever the PipeUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() + PipeSpeed, getY());
    }
}
