/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *This is the ship class for the battleship application
 * This class contain all information that is needed when
 * dealing with the ships in the game.
 * @author Oliver McAteer   
 */
public class Ship {
    
    //the cordinates indicate and (x,y) values for the poistions on the gameboard.
    public int cordinates[][];
    public int length;
    // status indicates the following 0 - inactive 1- alive 2- dead
    public int status;
    public String name;

    public int[][] getCordinates() {
        return cordinates;
    }

    public void setCordinates(int[][] cordinates) {
        this.cordinates = cordinates;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
