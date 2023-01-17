import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOne extends World
{
    int counter = 0;
    
    /**
     * Constructor for objects of class WorldOne.
     * 
     */
    public WorldOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1000, 1); 
        
        // create Flappy Bird
        FlappyBird flappybird = new FlappyBird();
        // add Flappy Bird to world
        addObject(flappybird, 100, getHeight()/2);
    }
    
    public void act() {
        counter++;
        if (counter == 100) {
            // create new pipe
            Pipe pipe = new Pipe();
            addObject(pipe, getWidth(), getHeight()/2);
            //System.out.println(counter);
            counter = 0;
        }
    }
}
