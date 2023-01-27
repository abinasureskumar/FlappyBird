import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    int PipeSpeed = -4;
    
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       setLocation(getX() + PipeSpeed, getY());
       
       //if (getOneIntersectingObject(PipeUp.class)!= null) {
        //System.out.println("GameOver");
        //PipeUp pipeup = new PipeUp();
        //GreenfootImage image = pipeup.getImage();
        //setLocation(getWorld().getWidth(), getWorld().getHeight()/2 + getY()/2);
        //pipeup.setLocation(getWorld().getWidth(), getWorld().getHeight()/-2 + getY()/3);
        //}
        
        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}
