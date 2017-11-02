
import java.util.ArrayList;
import processing.core.PApplet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JeremyBers
 */
public class WurstGame extends PApplet {
    
    
    
    private class Salesman {
        private int cash = 0;
        private int happiness = 0;
    
        private void move(){
        
        }
    
        private void incrementCash(int money){
            cash+=money;
        }
    
        private void incrementHappiness(int happy){
            happiness += happy;
        }
    }
    
    private abstract class AGameSlot implements GameSlot(){
    
    }

    
    private class gameBoard {
        private gameSlot[][] board = new gameSlot[7][7];
                
    }   
    
}

