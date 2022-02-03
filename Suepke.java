import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Suepke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suepke extends Actor
{
    /**
     * Act - do whatever the Suepke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Bildspeed = 0;
    int WasAufmKopf = 0;
    int CarriedThing = 0;
    private GreenfootImage Suepke1;
    private GreenfootImage Suepke2;
    private GreenfootImage Suepke3;
    private GreenfootImage Suepke4;
    Essen essen;
    Ypett ypett;
    public Suepke() {
       Suepke1 = new GreenfootImage("Suepke1.png");
       Suepke2 = new GreenfootImage("Suepke2.png");
       Suepke3 = new GreenfootImage("Suepke3.png");
       Suepke4 = new GreenfootImage("Suepke4.png");
    }
    
    public void act() 
    {
        checkKeys();
        checkCollision();
        imageFlip();
        Carry();
    } 
    
    public void Carry()
    {
        World w = getWorld();
        if (WasAufmKopf == 1) 
        {
            essen = w.getObjects(Essen.class).get(0);
            essen.setLocation(getX(), getY() - 70);
        }
        if (WasAufmKopf == 2)
        {
            ypett = w.getObjects(Ypett.class).get(0);
            ypett.setLocation(getX(), getY() -70);
        }
    }
    
    public void checkKeys()
    {
    if (Greenfoot.isKeyDown("right")) 
    {
        move(5);
    }
    if (Greenfoot.isKeyDown("left")) 
    {
        move(-5);
    }
    if (Greenfoot.isKeyDown("down")) 
    {
        turn(90);
        move(5);
        turn(-90);
    }
    if (Greenfoot.isKeyDown("up")) 
    {
        turn(-90);
        move(5);
        turn(90);
    }
    if (Greenfoot.isKeyDown("D")) 
    {
        move(5);
    }
    if (Greenfoot.isKeyDown("A")) 
    {
        move(-5);
    }
    if (Greenfoot.isKeyDown("S")) 
    {
        turn(90);
        move(5);
        turn(-90);
    }
    if (Greenfoot.isKeyDown("W")) 
    {
        turn(-90);
        move(5);
        turn(90);
    }
    }

    public void imageFlip() 
    {
    if (Bildspeed == 75) 
    {
    if (getImage() == Suepke1) 
    {
        setImage (Suepke2);
        Bildspeed = 0;
    }
    else if (getImage() == Suepke2) 
    {
        setImage(Suepke3);
        Bildspeed = 0;
    }
    else if (getImage() == Suepke3) 
    {
        setImage(Suepke4);
        Bildspeed = 0;
    }
    else if (getImage() == Suepke4) 
    {
        setImage(Suepke1);
        Bildspeed = 0;
    }
    
    } 
    else 
    {
    Bildspeed += 1;
    }
    }

    public void checkCollision()
    {
    Actor a = getOneIntersectingObject(PortalSpez.class);
    if (a != null) 
    {
        /* Ab zur Welt Spez */
        int m = getWorld().getObjects(Essen.class).size();
        int n = getWorld().getObjects(Ypett.class).size();
        Greenfoot.setWorld(new SpezWelt());
        for (int i = 0; i < m; i++){
            getWorld().addObject(essen, 500, 500);
        }
        for (int i = 0; i < n; i++){
            getWorld().addObject(essen, 500, 500);
        }
    }
    
    Actor b = getOneIntersectingObject(PortalStadt.class);
    if (b != null) 
    {
        /* Ab zur Welt Stadt */
        Greenfoot.setWorld(new StadtWelt());
    }
    
    Actor c = getOneIntersectingObject(PortalHeimat.class);
    if (c != null) 
    {
        /* Ab in die Heimat */
        Greenfoot.setWorld(new SpawnWelt());
    }
    
    Actor d = getOneIntersectingObject(Haus.class);
    if (d != null) 
    {
        /* Ab in die Hüdde */
    }
    
    Actor e = getOneIntersectingObject(Essen.class);
    if (e != null) 
    {
        if (WasAufmKopf == 0) 
        {
            if (Greenfoot.isKeyDown("e")) 
            {
                WasAufmKopf = 1;
            }
        } 
        else if (WasAufmKopf == 1) 
        {
            if (Greenfoot.isKeyDown("e")) 
            {
                WasAufmKopf = 0;
            }
        }
    }
    
    Actor f = getOneIntersectingObject(Ypett.class);
    if (f!= null) 
    {
        if (WasAufmKopf == 0) 
        {
            if (Greenfoot.isKeyDown("f"))
            {
                WasAufmKopf = 2;
            }
        }
        else if (WasAufmKopf == 2) 
        {
            if (Greenfoot.isKeyDown("f")) 
            {
                WasAufmKopf = 0;
            }
        }
    }
}
}
