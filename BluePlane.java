import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blueplane object controlled by A and D, has 3 lives, shoots BlueBullet objects
 * 
 * Timothy Wong
 * 2022-12-19
 */
public class BluePlane extends Actor
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
        if(shotTimer.millisElapsed() > 500)
        {
            blueShootingSound.stop();
            blueShootingSound.play();
            shoot();
        }
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
        move(1);
    }
    
    public void shoot()
    {
        //shoots a bluebullet every half second
            BlueBullet bluebullet = new BlueBullet();
            getWorld().addObject(bluebullet,getX(),getY());
            bluebullet.setRotation(getRotation());
            shotTimer.mark();
    }
    
    public BluePlane()
    {
        //change size of the blueplane
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
}
