import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * RedPlane soley made for the titlescreen (just rotates)
 * 
 * Timothy Wong
 * 2022-01-11
 */
public class DummyRedPlane extends Actor
{
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
        if(Greenfoot.isKeyDown("Left"))
        {
            setRotation(getRotation() - 2);
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            setRotation(getRotation() + 2);
        }
    }
    
    public DummyRedPlane()
    {
        //change size of the blueplane
        GreenfootImage image = getImage();
        image.scale(60, 60);
        setImage(image);
    }
}
