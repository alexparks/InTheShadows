/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intheshadows;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Alex Parks
 */
class Room extends Environment {

    public Room() {
        this.setBackground(Color.BLACK);
    }

    @Override
    public void initializeEnvironment() {
    }
    
    int counter;

    @Override
    public void timerTaskHandler() {
//        System.out.println("Blue  " + ++counter);
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        System.out.println("Key Press  " + e.getKeyChar());
//        System.out.println("Key Press  " + e.getKeyCode());

        if (e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("UP");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN){
            System.out.println("DOWN");
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("LEFT");
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("RIGHT");
        }
            
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        //room floor
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(100, 100, 3000, 1600);
        
        //lights
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(1600, 70, 60, 60);
        graphics.fillOval(3070, 800, 60, 60);
        graphics.fillOval(70, 800, 60, 60);
        
        graphics.setColor(Color.yellow);
        
        
        
        
        
        
        
        //walls
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 100, 1600);
        graphics.fillRect(0, 0, 3000, 100);
        graphics.fillRect(3100, 0, 100 ,1600 );
                
    }

}
