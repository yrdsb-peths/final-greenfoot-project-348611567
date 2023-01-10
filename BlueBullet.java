import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Projectile for the blue plane that destroys the red plane 
 * 
 * Timothy Wong
 * 2022-12-23
 */
public class BlueBullet extends BluePlane
{
    /**
     * Act - do whatever the BlueBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound blueExplosion = new GreenfootSound("mixkit-arcade-game-explosion-2759.wav");
    public void act()
    {
        // Add your action code here.
        //move forward
        move(4);
        if(isTouching(RedPlane.class))
        {
            //destroy redplane if they collide, take away a life from red
            // plane and create a new one if there are more lives
            blueExplosion.play();
            removeTouching(RedPlane.class);
            MyWorld world = (MyWorld) getWorld();
            if(world.redLife > 0)
            {
                world.createRed();
            }
            world.killRed();
        }
        MyWorld world = (MyWorld) getWorld();
        if(isAtEdge())
        {
            //destory itself when it collides with the wall
            world.removeObject(this);
        }
    }
    
    public BlueBullet()
    {
        //resize object
        GreenfootImage image = getImage();
        image.scale(8, 8);
        setImage(image);
    }
}
