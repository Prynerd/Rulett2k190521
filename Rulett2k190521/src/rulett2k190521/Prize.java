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
    public static double prize(BetType x){
        String s=String.valueOf(x);
        
        //példa: egyszerű számfogadások
        if(s.substring(0, 3).equals("SIN")){
            return 35.0;
        } 
        //folyt. köv.
        
        
        return  2.0;      // ez lehet az egyszerű tétek helyett 
    }
}
