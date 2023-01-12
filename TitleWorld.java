import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title world that shows how game works
 * 
 * Timothy Wong
 * 2023-01-11
 */
public class TitleWorld extends World
{
    /**
     * Constructor for objects of class TitleWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        GreenfootImage image = getBackground();
        image.scale(710, 710);
        setBackground(image);
        prepare();
    }
    
    public void act()
    {
        MyWorld gameWorld = new MyWorld();
        if(Greenfoot.isKeyDown("A") && Greenfoot.isKeyDown("D") && 
        Greenfoot.isKeyDown("Left") && Greenfoot.isKeyDown("Right"))
        {
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Plane Fight", 40);
        addObject(label,200,120);
        Label label2 = new Label("Hold A, D, Left and Right to Start!", 30);
        addObject(label2,191,162);
        label2.setLocation(200,160);
        DummyBluePlane dummyBluePlane = new DummyBluePlane();
        addObject(dummyBluePlane,100,230);
        DummyRedPlane dummyRedPlane = new DummyRedPlane();
        addObject(dummyRedPlane,300,230);
        Label label3 = new Label("A - D", 30);
        addObject(label3,100,275);
        Label label4 = new Label("< - >", 30);
        addObject(label4, 300,275);
    }
}
