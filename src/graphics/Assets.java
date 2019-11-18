/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;
import java.awt.image.BufferedImage;
/**
 *
 * @author copad
 */
public class Assets {
    


	
	public static BufferedImage player;
	
	public static void init()
	{
		player = Loader.ImageLoader("C:/Users/copad/Documents/NetBeansProjects/NavesSpaciales/src/res/player.png");
	}
	

}
