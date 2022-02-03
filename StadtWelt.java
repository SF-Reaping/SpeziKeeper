import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StadtWelt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StadtWelt extends Ueberwelt
{

    /**
     * Constructor for objects of class StadtWelt.
     * 
     */
    Suepke suepke;
    Essen essen;
    Ypett ypett;
    Trader trader;
    MarcelTelekom marceltelekom;
    public StadtWelt()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        addObject(new PortalSpez(), 75, 265);
        addObject(new PortalHeimat(), 285, 265);
        addObject(new DoenerDude(), 768, 282);
        suepke = new Suepke();
        essen = new Essen();
        ypett = new Ypett();
        trader = new Trader();
        marceltelekom = new MarcelTelekom();
        addObject(suepke, 800, 800);
        /** addObject(essen, 600, 510);
        addObject(ypett, 600, 510); **/
        addObject(trader, 505, 295);
        addObject(marceltelekom, 930, 270);
    }
}
