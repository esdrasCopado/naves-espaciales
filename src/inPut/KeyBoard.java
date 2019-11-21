/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inPut;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author copad
 */
public class KeyBoard implements KeyListener{
    public static boolean up,left,right,down;
    private boolean[] keys=new boolean[256];
    public KeyBoard(){
        up=false;
        left=false;
        right=false;
        down=false;
        
    }
    

    public void update(){
        up=keys[KeyEvent.VK_UP];
        down=keys[KeyEvent.VK_DOWN];
        left=keys[KeyEvent.VK_LEFT];
        right=keys[KeyEvent.VK_RIGHT];
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()]=true;
        update();
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()]=false;
        update();
        
    }
    @Override
    public void keyTyped(KeyEvent ke) {
       
    }
    
}
