import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Actor
{
    int FallDown = 0;
    int FallSpeed = 1;
    
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation( getX(), getY() + FallDown );
        
        // If space key is pressed -> bird fly up
        if (Greenfoot.isKeyDown("space") == true) {
            FallDown = -10;
        }
        FallDown = FallDown + FallSpeed;
    }
}
