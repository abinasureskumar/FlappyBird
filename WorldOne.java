import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOne extends World
{

    /**
     * Constructor for objects of class WorldOne.
     * 
     */
    public WorldOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1000, 1); 
        
        // Create Flappy Bird
        FlappyBird flappybird = new FlappyBird();
        
        // Add Flappy Bird to World
        addObject(flappybird, 100, getHeight()/2);
    }
}
