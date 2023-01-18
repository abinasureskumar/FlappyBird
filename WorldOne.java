import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    // first pipe appears after counter is at 400
    int FirstPipe = 400;
    ScoreCounter scorecounter = new ScoreCounter();
    
    /**
     * Constructor for objects of class WorldOne.
     * 
     */
    public WorldOne()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 850, 1); 
        
        //set paint order
        setPaintOrder(ScoreCounter.class, GameOver.class, FlappyBird.class, Pipe.class, PipeUp.class);
        
        // create Flappy Bird & add it to world
        FlappyBird flappybird = new FlappyBird();
        addObject(flappybird, 150, getHeight()/2);
        
        // display score
        scorecounter.setScore(0);
        addObject(scorecounter, 50, 50);
    }
    
    public void act() {
        PipeCounter++;
        if (PipeCounter % 100 == 0) {
            // create new pipe(down)
            int[] arrayDown = {2, 3, 4};
            Pipe pipe = new Pipe();
            GreenfootImage image = pipe.getImage();
            //addObject(pipe, getWidth(), getHeight()/2 + image.getHeight()/ (Greenfoot.getRandomNumber(3) + 1));
            addObject(pipe, getWidth(), getHeight()/2 + image.getHeight()/(Greenfoot.getRandomNumber(arrayDown.length) + 1));
            
            //create new pipe(up)
            int[] arrayUp = {-2, -3, -4};
            PipeUp pipeup = new PipeUp();
            GreenfootImage imageUp = pipeup.getImage();
            //addObject(pipeup, getWidth(), getHeight()/-2 + imageUp.getHeight()/2);
            addObject(pipeup, getWidth(), getHeight()/-2 + imageUp.getHeight()/(Greenfoot.getRandomNumber(arrayUp.length) + 1));
            //System.out.println(PipeCounter);
        }
        
        if (PipeCounter >= FirstPipe) {
            if (counter % 100 == 0) {
                score++;
                //System.out.println(score);
                scorecounter.setScore(score);
            }
            counter++;
        }
    }
}
