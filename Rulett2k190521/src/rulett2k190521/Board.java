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

        //0
        BetType[] nr0 = {BetType.SINGLE_00, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.TRIO_00_03};
        table.add(new HashSet(Arrays.asList(nr0)));

        //1
        BetType[] nr1 = {BetType.SINGLE_01, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.SPLIT_01_02, BetType.SPLIT_01_04, BetType.CORNER_01_05,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.COLOUR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr1)));

        //2
        BetType[] nr2 = {BetType.SINGLE_02, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.TRIO_00_03, BetType.SPLIT_01_02, BetType.SPLIT_02_03, BetType.SPLIT_02_05, BetType.CORNER_01_05,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.COLOUR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr2)));

        //3
        BetType[] nr3 = {BetType.SINGLE_03, BetType.FIRST_FOUR,
            BetType.TRIO_00_03, BetType.SPLIT_02_03, BetType.SPLIT_03_06, BetType.CORNER_02_06,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.COLOUR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr3)));

        //4
        BetType[] nr4 = {BetType.SINGLE_04, BetType.SPLIT_01_04, BetType.SPLIT_04_05, BetType.SPLIT_04_07, BetType.CORNER_01_05,
            BetType.CORNER_04_08, BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.COLOUR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr4)));
        
        //5
        BetType[] nr5 = {BetType.SINGLE_05, BetType.SPLIT_02_05, BetType.SPLIT_04_05, BetType.SPLIT_05_06, BetType.SPLIT_05_08,
            BetType.CORNER_01_05, BetType.CORNER_02_06, BetType.CORNER_05_09,
            BetType.CORNER_04_08, BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.COLOUR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr5)));
        
        //6
        BetType[] nr6 = {BetType.SINGLE_06, BetType.SPLIT_03_06, BetType.SPLIT_05_06, BetType.SPLIT_06_09,
            BetType.CORNER_02_06, BetType.CORNER_05_09,
            BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.COLOUR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr6)));
        
        //7
        BetType[] nr7 = {BetType.SINGLE_07, BetType.SPLIT_04_07, BetType.SPLIT_07_08, BetType.SPLIT_07_10,
            BetType.CORNER_04_08, BetType.CORNER_07_11,
            BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.COLOUR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr7)));
        
        //8
        BetType[] nr8 = {BetType.SINGLE_08, BetType.SPLIT_05_08, BetType.SPLIT_07_08, BetType.SPLIT_08_09, BetType.SPLIT_08_11,
            BetType.CORNER_05_09, BetType.CORNER_07_11, BetType.CORNER_08_12,
            BetType.CORNER_04_08, BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.COLOUR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr8)));
        
        //9
        BetType[] nr9 = {BetType.SINGLE_09, BetType.SPLIT_06_09, BetType.SPLIT_08_09, BetType.SPLIT_09_12,
            BetType.CORNER_08_12, BetType.CORNER_05_09,
            BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.COLOUR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr9)));
        
        //10
        BetType[] nr10 = {BetType.SINGLE_10, BetType.SPLIT_07_10, BetType.SPLIT_10_11, BetType.SPLIT_10_13,
            BetType.CORNER_07_11, BetType.CORNER_10_14,
            BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.COLOUR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr10)));
        
        //11
        BetType[] nr11 = {BetType.SINGLE_11, BetType.SPLIT_08_11, BetType.SPLIT_10_11, BetType.SPLIT_11_12, BetType.SPLIT_11_14,
            BetType.CORNER_07_11, BetType.CORNER_08_12, BetType.CORNER_10_14,
            BetType.CORNER_11_15, BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.COLOUR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr11)));
        
        //12
        BetType[] nr12 = {BetType.SINGLE_12, BetType.SPLIT_09_12, BetType.SPLIT_11_12, BetType.SPLIT_12_15,
            BetType.CORNER_08_12, BetType.CORNER_11_15,
            BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.COLOUR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr12)));
    }
    
    public HashSet<BetType> getWinningBets(int nrSpun){
        return (HashSet)table.get(nrSpun).clone();
    }
}
