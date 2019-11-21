/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameObjects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;

/**
 *
 * @author copad
 */
public abstract class GameObject {
    protected BufferedImage texture;
    protected Vector2D position;
    
    public GameObject(Vector2D position,BufferedImage textura){
        this.position=position;
        this.texture=textura;
    }
    
    public abstract void update();

    /**
     *
     * @param g
     */
    public abstract void draw(Graphics g);

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }
    
}
