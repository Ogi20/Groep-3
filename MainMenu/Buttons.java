import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Color;
/**
 * In the class Buttons are all the functions that the menu buttons need.
 * 
 * @author (Mark Hartgring) 
 * @version (1.0)
 */
public class Buttons extends Actor
{
    /**The function onMouseHover replaces the image with text when the mouse hovers over it*/
    public void onMouseHover(Class HoverClass, String OrgPath){
        MouseInfo mouse = Greenfoot.getMouseInfo();  
        if (mouse != null) { 
            setImage(OrgPath);  
            List objects = getWorld().getObjectsAt(mouse.getX(), mouse.getY(), HoverClass);  
            for (Object object : objects)  
            {  
                if (object == this)  
                {  
                    /** Replace the image of the hovered button with the generated image, which contains the description of the mini-game.*/
                    setImage(DisplayDescription(HoverClass));  
                }  
            }  
        }  

    }

    /**The function DisplayDescription returns an images with the description of the mini-game. */
    public GreenfootImage DisplayDescription(Class DT){
        String message = "";
        if (DT == Mechanic.class){
            message = "In deze game is \n het de bedoeling \n dat je zo snel \n mogelijk boten \n repareert.";
        }
        else if (DT == Container.class){
            message = "In deze game moet je containers \n overslaan naar verschillende schepen.";
        }
        else if (DT == ShipController.class){
            message = "In deze game moet je de binnenkomende schepen \n een aanlegplaats toewijzen.";        
        }
        else if (DT == Surfer.class){
            message = "In deze game is het de \n bedoeling  dat  je rotsen \n vermijd  en prijzen oppakt.";        
        }

        GreenfootImage image = new GreenfootImage(message, 20, Color.black, null);
        return image;
    }

}
