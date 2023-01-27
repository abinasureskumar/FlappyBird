import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class WorldOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldOne extends World
{
    int PipeCounter = 0;
    int counter = 0;
    int score = 0;
    int levelCounter = 0;
    
    // first pipe appears after counter is at 400
    int FirstPipe = 400;
    
    ScoreCounter scorecounter = new ScoreCounter();
    Level level = new Level();
    
    /**
     * Constructor for objects of class WorldOne.
     * 
     */
    public WorldOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 1000, 1); 
        //set paint order
        setPaintOrder(ScoreCounter.class, GameOver.class, FlappyBird.class, Pipe.class, PipeUp.class);
        
        // create Flappy Bird & add it to world
        FlappyBird flappybird = new FlappyBird();
        addObject(flappybird, 150, getHeight()/2);
        
        
        // display score
        scorecounter.setScore(0);
        addObject(scorecounter, 50, 50);
        
        //display Level
        //displays Level 1 from the start
        level.setLevel(1);
        addObject(level, 50, 100);
    }
    
    public void act() {
        PipeCounter++;
        if (PipeCounter % 100 == 0) {
            // create new pipe(down)
            Pipe pipe = new Pipe();
            GreenfootImage image = pipe.getImage();
            int pipeHeight = image.getHeight() / (Greenfoot.getRandomNumber(5) + 1);
            ////addObject(pipe, getWidth(), getHeight()/2 + image.getHeight()/ (Greenfoot.getRandomNumber(5) + 1));
            addObject(pipe, getWidth(), getHeight()/2 + pipeHeight);
            
    
            //create new pipe(up)
            //PipeUp pipeup = new PipeUp();
            //GreenfootImage imageUp = pipeup.getImage();
            //addObject(pipeup, getWidth(), getHeight()/-2 + imageUp.getHeight()/(Greenfoot.getRandomNumber(3) + 1));
            //System.out.println(PipeCounter);
            
            // adds life to world
            if (PipeCounter % 300 == 0) {
                Life life = new Life();
                addObject(life, getWidth(), getHeight()/3 - pipeHeight/2 - 50);
            }
        }
        
        
        if (PipeCounter >= FirstPipe) {
            if (counter % 100 == 0) {
                score++;
                //System.out.println(score);
                scorecounter.setScore(score);
            }
            counter++;
        }
        
        if (score == 20) {
            levelCounter = 2;
            level.setLevel(levelCounter);
        }
    }
}
