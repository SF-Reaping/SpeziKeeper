import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treppe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treppe extends Actor
{
    /**
     * Act - do whatever the Treppe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision();
    }
    public void checkCollision() {
        Actor a = getOneIntersectingObject(Essen.class);
        if (a != null) {
            getWorld().removeObject(a);
        }
    }
}
