import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Essen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Essen extends Actor

{
    public int Scaled = 0;
    public int AufmKopf = 0;
    public int suepkeX = 0;
    public int suepkeY = 0;
    Suepke suepke;
    /**
     * Act - do whatever the Essen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() 
{
    World w = getWorld();
    suepke = w.getObjects(Suepke.class).get(0);
    Mitbewegen();
}
public void checkCollision()
{
Actor e = getOneIntersectingObject(Suepke.class);
    if (e != null) {
        if (AufmKopf == 0) {
            if (Greenfoot.isKeyDown("e")) {
                AufmKopf = 1;
            }
        }
    }
}
public void Mitbewegen()
{
    if (AufmKopf == 1) {
        setLocation(suepke.getX(), suepke.getY());
    }
}
}
