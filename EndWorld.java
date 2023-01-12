import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * End world that displays the winner of the game and updates the score
 * 
 * Timothy Wong
 * 2023-01-11
 */
public class EndWorld extends World
{
    boolean redWin = false;
    boolean blueWin = false;
    GreenfootSound victorySound = new GreenfootSound("victory_sJDDywi.mp3");
    
    /**
     * Constructor for objects of class EndWorld.
     * 
     */
    public EndWorld()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        GreenfootImage image = getBackground();
        image.scale(400, 400);
        setBackground(image);
    }
    
    public void act()
    {
        //call prepare in act() in order for it to draw the "Blue wins" or "Red wins"
        prepare();
        if(Greenfoot.isKeyDown("Space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press space to play again", 30);
        addObject(label,200,260);
        if(blueWin)
        {
            Label label2 = new Label("Blue wins!", 60);
            addObject(label2,200,200);
            DummyBluePlane dummyBluePlane = new DummyBluePlane();
            addObject(dummyBluePlane,200,120);
            blueWin = false;
            victorySound.play();
        }
        else if(redWin)
        {
            Label label3 = new Label("Red wins!", 60);
            addObject(label3,200,200);
            DummyRedPlane dummyRedPlane = new DummyRedPlane();
            addObject(dummyRedPlane,200,120);
            redWin = false;
            victorySound.play();
        }
    }

}
