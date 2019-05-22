/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rulett2k190521;

/**
 *
 * @author imaginifer
 */
public class Prize {

    //Ez a metódus azonosítja a fogadáshoz tartozó tétszorzót,
    //  a Stringgé alakított enumnév betűinek alapján. 
    public static double prize(BetType x) {
        String s = String.valueOf(x);

        //példa: egyszerű számfogadások
        if (s.substring(0, 3).equals("SIN")) {
            return 35.0;
        }
        if (s.substring(0, 3).equals("SPL")) {
            return 17.0;
        }
        if (s.substring(0, 3).equals("COR")) {
            return 8.0;
        }
        if (s.substring(0, 3).equals("TRI")) {
            return 11.6;
        }
        if (s.substring(0, 3).equals("FIR")) {
            return 8.0;
        }
        if (s.substring(0, 3).equals("STR")) {
            return 11.0;
        }
        if (s.substring(0, 3).equals("SIX")) {
            return 5.0;
        }
        if (s.substring(0, 3).equals("THI")) {
            return 2.0;
        }
        if (s.substring(0, 3).equals("HAL")) {
            return 1.0;
        }
        if (s.substring(0, 3).equals("COL")) {
            return 2.0;
        }
        if (s.substring(0, 3).equals("NUM")) {
            return 1.0;
        }
        if (s.substring(0, 3).equals("CLR")) {
            return 1.0;
        }
        return 0;
    }
}
