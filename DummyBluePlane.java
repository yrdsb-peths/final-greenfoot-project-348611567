import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * BluePlane soley made for the titlescreen (just rotates)
 * 
 * Timothy Wong
 * 2022-01-11
 */
public class DummyBluePlane extends Actor
{
    GreenfootSound blueShootingSound = new GreenfootSound("shooting_sound-copy.wav");
    SimpleTimer shotTimer = new SimpleTimer();
    int n = 0;
    /**
     * Act - do whatever the RedPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //set the base rotation of the blue plane so that it does not face the redplane
        for(int i = n; i < 1; i++)
        {
            setRotation(270);
            n++;
            i++;
        }
        move();
    }
    
    public void move()
    {
        //controls the movement of the blue plane
        if(Greenfoot.isKeyDown("A"))
        {
            setRotation(getRotation() - 2);
        }
        if(Greenfoot.isKeyDown("D"))
        {
            setRotation(getRotation() + 2);
        }
    }
    
    public DummyBluePlane()
    {
        //change size of the blueplane
        GreenfootImage image = getImage();
        image.scale(60, 60);
        setImage(image);
    }
}
