import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    //constructor
    public ScoreCounter() {
        GreenfootImage newImage = new GreenfootImage(80, 40);
        setImage(newImage);
    }
    
    // creats / draws score counter
    public void setScore(int score) {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        Font font = new Font("Agency FB", 36);
        newImage.setFont(font);
        
        newImage.setColor(Color.WHITE);
        newImage.fill();
        newImage.setColor(Color.BLACK);
        newImage.drawString("" + score, 30, 34);
        setImage(newImage);
        
        // changes background image once score hits 20
        if (score == 20) {
            GreenfootImage img = new GreenfootImage("imgTwo.jpg");
            img.scale(getWorld().getWidth(), getWorld().getHeight());
            getWorld().setBackground(new GreenfootImage(img));
        }
    }
}
