/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rulett2k190521;

/**
 *
 * @author progmatic
 */
public class BoardField {
    
    private int number;
    private String colour ;

    public BoardField(int number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public String getColour() {
        return colour;
    }
    
    
    
}
