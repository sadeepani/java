
package src;

import javax.swing.UIManager;
import org.pushingpixels.substance.api.skin.EmeraldDuskSkin;
import ui.Welcome;
public class Driver {
    public static void main(String[]args){
        try{
           UIManager.setLookAndFeel("org.pushingpixels.substance.api.skin.EmeraldDuskSkin");
           
           new Welcome().setVisible(true);
           
        }catch(Exception e){
            
            System.out.println(e);
        }
    }
}
