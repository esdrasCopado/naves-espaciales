/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObjects;

import graphics.Assets;
import inPut.KeyBoard;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

/**
 *
 * @author copad
 */
public class Player extends GameObject{
      protected BufferedImage texture;
    protected Vector2D position;
    
    public Player(Vector2D position, BufferedImage textura) {
        super(position, textura);
        this.texture=textura;
        this.position=position;
        
        
    }

    @Override
    public void update() {
        if(KeyBoard.right)
            position.setX(position.getX()+5);
        if (KeyBoard.up) {
            
            position.setY(position.getY() - 5);
        }
        if(KeyBoard.down){
            position.setY(position.getY() + 5);
        }
        if (KeyBoard.left) {
            position.setX(position.getX() - 5);
        }
            
            
        
        
    }

    @Override
    public void draw(Graphics g) {
        
        g.drawImage(texture,(int)position.getX(), (int)position.getY(), null);
    }
    
}
