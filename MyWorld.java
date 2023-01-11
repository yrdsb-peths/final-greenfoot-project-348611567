import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main game world (Where players fight)
 * 
 * Timothy Wong
 * 2022-12-19
 */
public class MyWorld extends World
{
    public int redLife = 3;
    Counter redLifeCounter;
    
    public int blueLife = 3;
    Counter blueLifeCounter;
    
    public boolean redLose = false;
    public boolean blueLose = false;
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
        addObject(bluePlane,123,191);

        redLifeCounter = new Counter();
        redLifeCounter.setValue(redLife);
        addObject(redLifeCounter,340,25);
        
        blueLifeCounter = new Counter();
        blueLifeCounter.setValue(blueLife);
        addObject(blueLifeCounter,60,25);
    }
    
    //destroy red plane and update the counter if there are more lives
    public void killRed()
    {
        redLife--;
        if(redLife < 0)
        {
            redLife = 0;
            redLose = true;
        }
        redLifeCounter.setValue(redLife);
    }
    
    //create another red plane
    public void createRed()
    {
        RedPlane redPlane = new RedPlane();
        addObject(redPlane,287,191);
    }
    
    //destroy blue plane and update the counter if there are more lives
    public void killBlue()
    {
        blueLife--;
        if(blueLife < 0)
        {
            blueLife = 0;
            blueLose = true;
        }
        blueLifeCounter.setValue(blueLife);
    }
    
    //create another red plane
    public void createBlue()
    {
        BluePlane bluePlane = new BluePlane();
        addObject(bluePlane,123,196);
    }
}
