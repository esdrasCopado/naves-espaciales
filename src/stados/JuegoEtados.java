/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stados;

import gameObjects.*;
import graphics.Assets;
import java.awt.Graphics;
import math.Vector2D;

/**
 *
 * @author copad
 */
public class JuegoEtados {
    private Player player;
    public JuegoEtados(){
        player=new Player(new Vector2D(100,500), Assets.player);
    }
    public void update(){
        player.update();
    }
    public void draw(Graphics g){
        player.draw(g);
        
        
    }
    
}
