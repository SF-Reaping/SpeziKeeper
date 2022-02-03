    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpawnWelt extends Ueberwelt
{

    /**
     * Constructor for objects of class Spawnwelt.
     * 
     */
    Suepke suepke;
    Essen essen;
    Ypett ypett;
    
    public SpawnWelt()
    {    
        super(1000, 1000, 1);
        addObject(new Haus(), 250, 510);
        addObject(new PortalSpez(), 428, 152);
        addObject(new PortalStadt(), 481, 854);
        suepke = new Suepke();
        essen = new Essen();
        ypett = new Ypett();
        addObject(suepke, 600, 510);
        /** addObject(essen, 600, 510); 
        addObject(ypett, 600, 510); **/
        
    }
    
    public Suepke getSuepke(){
        return suepke;
    }    
}
