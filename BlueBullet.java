import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueBullet extends BluePlane
{
    /**
     * Act - do whatever the BlueBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(4);
        if(isTouching(RedPlane.class))
        {
            removeTouching(RedPlane.class);
        }
    }
    
    public BlueBullet()
    {
        GreenfootImage image = getImage();
        image.scale(8, 8);
        setImage(image);
    }
}
