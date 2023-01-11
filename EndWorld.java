import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * End world that displays the winner of the game and updates the score
 * 
 * Timothy Wong
 * 2023-01-11
 */
public class EndWorld extends World
{

    /**
     * Constructor for objects of class EndWorld.
     * 
     */
    public EndWorld()
    {    
        // Create a new world with 400x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press space to play again", 30);
        addObject(label,203,280);
        MyWorld world = new MyWorld();
        if(world.redLose)
        {
            Label label2 = new Label("Blue wins!", 40);
            addObject(label2,203,230);
        }
    }
}
