import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Projectile for the red plane that destroys the blue plane 
 * 
 * Timothy Wong
 * 2022-12-23
 */
public class RedBullet extends RedPlane
{
    /**
     * Act - do whatever the RedBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound redExplosion = new GreenfootSound("mixkit-arcade-game-explosion-2759.wav");
    public void act()
    {
        // Add your action code here.
        move(4);
        if(isTouching(BluePlane.class))
        {
            removeTouching(BluePlane.class);
            redExplosion.play();
        }
        MyWorld world = (MyWorld) getWorld();
        if(isAtEdge())
        {
            world.removeObject(this);
        }
    }
    
    public RedBullet()
    {
        GreenfootImage image = getImage();
        image.scale(8, 8);
        setImage(image);
    }
}
