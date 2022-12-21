import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBullet extends RedPlane
{
    /**
     * Act - do whatever the RedBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(4);
    }
    
    public RedBullet()
    {
        GreenfootImage image = getImage();
        image.scale(8, 8);
        setImage(image);
    }
}
