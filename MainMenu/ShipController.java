import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The class ShipController shows a menu button for the 'Controle cetrum' mini-game.
 * 
 * @author (Mark Hartgring) 
 * @version (1.0)
 */
public class ShipController extends Buttons
{
    public void act() 
    {
        //replaces image with description when hovered
        onMouseHover(ShipController.class, "images/rsz_hq.png");  
    }    
}
