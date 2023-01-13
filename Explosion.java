import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    GreenfootImage[] explosion = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Explosion()
    {
        for(int i = 0; i < explosion.length; i++)
        {
            explosion[i] = new GreenfootImage("images/explosion/explosion" + i + ".png");
            explosion[i].scale(50, 50);
        }
        setImage(explosion[0]);
    }
    
    public void act()
    {
        // Add your action code here.
        animateExplosion();
    }
    
    int imageIndex = 0;
    public void animateExplosion()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        else
        {
            setImage(explosion[imageIndex]);
            imageIndex = (imageIndex + 1) % explosion.length;
        }
    }
}
