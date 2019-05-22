/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rulett2k190521;

import java.util.*;

/**
 *
 * @author imaginifer
 */
public class Board {
    private final ArrayList<HashSet<BetType>> table;
    //ez tartja nyilván, hogy 0-36 indexei reprezentálta rulettszámok
    // milyen fogadás esetén nyerőek
    public Board(){
        table=new ArrayList<>();
        
        //példa: nulla
        BetType[] nr0={BetType.SINGLE_00,BetType.FIRST_FOUR
                ,BetType.TRIO_00_02,BetType.TRIO_00_03};
        table.add(new HashSet(Arrays.asList(nr0)));
        //36-ig folyt. köv.
        
    }
    
    public HashSet<BetType> getWinningBets(int nrSpun){
        return (HashSet)table.get(nrSpun).clone();
    }
}
