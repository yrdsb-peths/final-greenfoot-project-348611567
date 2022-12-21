import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedPlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedPlane extends Actor
{
    /**
     * Act - do whatever the RedPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move();
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("A"))
        {
            setRotation(getRotation() + 2);
        }
        if(Greenfoot.isKeyDown("D"))
        {
            setRotation(getRotation() - 2);
        }
    }
    
    public RedPlane()
    {
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
}
