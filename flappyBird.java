import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
        
        // when flappyBird at edge or touched pipe, add GameOver text to world
        GameOver gameover = new GameOver();
        if (getY() == getWorld().getHeight()-1 || getY() == 0 || getOneIntersectingObject(Pipe.class)!= null || getOneIntersectingObject(PipeUp.class)!= null) {
            getWorld().addObject(gameover, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
            //System.out.println("GameOver");
        }
        
        // removes the next couple pipes seen in the world when flappybird touches life
        List<Life> lives = getIntersectingObjects(Life.class);
        if (!lives.isEmpty()) {
            for(Life life: lives) {
                // remove all actors of type Pipe from the world
                getWorld().removeObjects(getWorld().getObjects(Pipe.class));
            }
        }
    }
}
