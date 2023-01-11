import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleWorld extends World
{

    /**
     * Constructor for objects of class TitleWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        GreenfootImage image = getBackground();
        image.scale(710, 710);
        setBackground(image);
    }
}
