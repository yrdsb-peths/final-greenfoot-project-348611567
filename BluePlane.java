import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BluePlane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePlane extends Actor
{
    /**
     * Act - do whatever the BluePlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move();
        shoot();
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("Left"))
        {
            setRotation(getRotation() - 2);
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            setRotation(getRotation() + 2);
        }
        move(1);
    }
    
    public void shoot()
    {
        
    }
    
    public BluePlane()
    {
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
}
