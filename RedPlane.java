import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Redplane object controlled by < and >, has 3 lives, shoots RedBullet objects
 * 
 * Timothy Wong 
 * 2022-12-19
 */
public class RedPlane extends Actor
{
    SimpleTimer shotTimer = new SimpleTimer();
    int n = 0;
    /**
     * Act - do whatever the RedPlane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        for(int i = n; i < 1; i++)
        {
            setRotation(90);
            n++;
            i++;
        }
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
        if(shotTimer.millisElapsed() > 500)
        {
            RedBullet redbullet = new RedBullet();
            getWorld().addObject(redbullet,getX(),getY());
            redbullet.setRotation(getRotation());
            shotTimer.mark();
        }
    }
    
    public RedPlane()
    {
        setImage(new GreenfootImage("images/Red Plane.png"));
        GreenfootImage image = getImage();
        image.scale(30, 30);
        setImage(image);
    }
}
