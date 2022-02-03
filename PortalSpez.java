import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalSpez extends Actor
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int Scaled = 0;
    int Bildspeed = 0;
    int Test = 0;
    private GreenfootImage Portal1;
    private GreenfootImage Portal2;
    public PortalSpez() 
    {
        Portal1 = new GreenfootImage("Portal1-ConvertImage.png");
        Portal2 = new GreenfootImage("Portal2-ConvertImage.png");
        setImage(Portal1);
    }
    public void act() 
    {
        imageFlip();
    }  
    public void imageFlip() 
    {
    if (Bildspeed == 75) 
    {
    if (getImage() == Portal1) 
    {
        setImage(Portal2);
        Bildspeed = 0;
    } 
    else 
    {
        setImage(Portal1);
        Bildspeed = 0;
    }
    } 
    else 
    {
    Bildspeed += 1;
    }
    }
}
