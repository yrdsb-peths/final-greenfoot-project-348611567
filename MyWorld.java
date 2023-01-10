import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main game world (Where players fight)
 * 
 * Timothy Wong
 * 2022-12-19
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        GreenfootImage image = getBackground();
        image.scale(425, 425);
        setBackground(image);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RedPlane redPlane = new RedPlane();
        addObject(redPlane,287,191);
        BluePlane bluePlane = new BluePlane();
        addObject(bluePlane,123,196);

    }
}
