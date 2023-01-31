import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    // constructor
    public Level() {
        GreenfootImage newImage = new GreenfootImage(120, 40);
        setImage(newImage);
    }
    
    // creats / draws level counter
    public void setLevel(int levelCounter) {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        Font font = new Font("Agency FB", 36);
        newImage.setFont(font);
        
        newImage.setColor(Color.WHITE);
        newImage.fill();
        newImage.setColor(Color.BLACK);
        newImage.drawString("Level " + levelCounter, 30, 34);
        setImage(newImage);
    }
}
