import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Projectile for the red plane that destroys the blue plane 
 * 
 * Timothy Wong
 * 2022-12-23
 */
public class RedBullet extends Actor
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
            //destroy redplane if they collide, take away a life from blue
            // plane and create a new one if there are more lives
            redExplosion.play();
            removeTouching(BluePlane.class);
            MyWorld world = (MyWorld) getWorld();
            if(world.blueLife > 0)
            {
                world.createBlue();
            }
            world.killBlue();
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
