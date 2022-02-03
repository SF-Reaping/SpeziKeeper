    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpezWelt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpezWelt extends Ueberwelt
{

    /**
     * Constructor for objects of class SpezWelt.
     * 
     */
    Suepke suepke;
    Essen essen;
    Ypett ypett;
    Treppe treppe;
    public SpezWelt()
    {    
        super(1000, 1000, 1);
        addObject(new PortalStadt(), 200, 750);
        addObject(new PortalHeimat(), 775, 570);
        suepke = new Suepke();
        essen = new Essen();
        ypett = new Ypett();
        treppe = new Treppe();
        addObject(suepke, 140, 150);
        /** addObject(essen, 600, 510);
        addObject(ypett, 600, 510); **/
        addObject(treppe, 724, 140);
    }
    
    public Suepke getSuepke(){
        return suepke;
    }    
}
