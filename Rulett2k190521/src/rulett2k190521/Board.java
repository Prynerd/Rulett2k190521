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
    public Board() {
        table = new ArrayList<>();

        //0
        BetType[] nr0 = {BetType.SINGLE_00, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.TRIO_00_03};
        table.add(new HashSet(Arrays.asList(nr0)));

        //1
        BetType[] nr1 = {BetType.SINGLE_01, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.SPLIT_01_02, BetType.SPLIT_01_04, BetType.CORNER_01_05,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr1)));

        //2
        BetType[] nr2 = {BetType.SINGLE_02, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.TRIO_00_03, BetType.SPLIT_01_02, BetType.SPLIT_02_03, BetType.SPLIT_02_05, BetType.CORNER_01_05,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr2)));

        //3
        BetType[] nr3 = {BetType.SINGLE_03, BetType.FIRST_FOUR,
            BetType.TRIO_00_03, BetType.SPLIT_02_03, BetType.SPLIT_03_06, BetType.CORNER_02_06,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr3)));

        //4
        BetType[] nr4 = {BetType.SINGLE_04, BetType.SPLIT_01_04, BetType.SPLIT_04_05, BetType.SPLIT_04_07, BetType.CORNER_01_05,
            BetType.CORNER_04_08, BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr4)));

        //5
        BetType[] nr5 = {BetType.SINGLE_05, BetType.SPLIT_02_05, BetType.SPLIT_04_05, BetType.SPLIT_05_06, BetType.SPLIT_05_08,
            BetType.CORNER_01_05, BetType.CORNER_02_06, BetType.CORNER_05_09,
            BetType.CORNER_04_08, BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr5)));

        //6
        BetType[] nr6 = {BetType.SINGLE_06, BetType.SPLIT_03_06, BetType.SPLIT_05_06, BetType.SPLIT_06_09,
            BetType.CORNER_02_06, BetType.CORNER_05_09,
            BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr6)));

        //7
        BetType[] nr7 = {BetType.SINGLE_07, BetType.SPLIT_04_07, BetType.SPLIT_07_08, BetType.SPLIT_07_10,
            BetType.CORNER_04_08, BetType.CORNER_07_11,
            BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr7)));

        //8
        BetType[] nr8 = {BetType.SINGLE_08, BetType.SPLIT_05_08, BetType.SPLIT_07_08, BetType.SPLIT_08_09, BetType.SPLIT_08_11,
            BetType.CORNER_05_09, BetType.CORNER_07_11, BetType.CORNER_08_12,
            BetType.CORNER_04_08, BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr8)));

        //9
        BetType[] nr9 = {BetType.SINGLE_09, BetType.SPLIT_06_09, BetType.SPLIT_08_09, BetType.SPLIT_09_12,
            BetType.CORNER_08_12, BetType.CORNER_05_09,
            BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr9)));

        //10
        BetType[] nr10 = {BetType.SINGLE_10, BetType.SPLIT_07_10, BetType.SPLIT_10_11, BetType.SPLIT_10_13,
            BetType.CORNER_07_11, BetType.CORNER_10_14,
            BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr10)));

        //11
        BetType[] nr11 = {BetType.SINGLE_11, BetType.SPLIT_08_11, BetType.SPLIT_10_11, BetType.SPLIT_11_12, BetType.SPLIT_11_14,
            BetType.CORNER_07_11, BetType.CORNER_08_12, BetType.CORNER_10_14,
            BetType.CORNER_11_15, BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr11)));

        //12
        BetType[] nr12 = {BetType.SINGLE_12, BetType.SPLIT_09_12, BetType.SPLIT_11_12, BetType.SPLIT_12_15,
            BetType.CORNER_08_12, BetType.CORNER_11_15,
            BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr12)));
        
        //13
        BetType[] nr13 = {BetType.SINGLE_13, BetType.SPLIT_10_13, BetType.SPLIT_13_14, BetType.SPLIT_13_16,
            BetType.CORNER_13_17, BetType.CORNER_10_14,
            BetType.STREET_13, BetType.SIX_LINE_13, BetType.SIX_LINE_10,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr13)));
        
        //14
        BetType[] nr14 = {BetType.SINGLE_14, BetType.SPLIT_11_14, BetType.SPLIT_13_14, BetType.SPLIT_14_15, BetType.SPLIT_14_17,
            BetType.CORNER_11_15, BetType.CORNER_13_17, BetType.CORNER_14_18,
            BetType.CORNER_10_14, BetType.STREET_13, BetType.SIX_LINE_13, BetType.SIX_LINE_10,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr14)));
        
        //15
        BetType[] nr15 = {BetType.SINGLE_15, BetType.SPLIT_12_15, BetType.SPLIT_14_15, BetType.SPLIT_15_18,
            BetType.CORNER_11_15, BetType.CORNER_14_18,
            BetType.STREET_13, BetType.SIX_LINE_13, BetType.SIX_LINE_10,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr15)));
        
        //16
        BetType[] nr16 = {BetType.SINGLE_16, BetType.SPLIT_13_16, BetType.SPLIT_16_17, BetType.SPLIT_16_19,
            BetType.CORNER_13_17, BetType.CORNER_16_20,
            BetType.STREET_16, BetType.SIX_LINE_13, BetType.SIX_LINE_16,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr16)));
        
        //17
        BetType[] nr17 = {BetType.SINGLE_17, BetType.SPLIT_14_17, BetType.SPLIT_16_17, BetType.SPLIT_17_18, BetType.SPLIT_17_20,
            BetType.CORNER_16_20, BetType.CORNER_13_17, BetType.CORNER_14_18,
            BetType.CORNER_17_21, BetType.STREET_16, BetType.SIX_LINE_13, BetType.SIX_LINE_16,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr17)));
        
        //18
        BetType[] nr18 = {BetType.SINGLE_18, BetType.SPLIT_15_18, BetType.SPLIT_17_18, BetType.SPLIT_18_21,
            BetType.CORNER_14_18, BetType.CORNER_17_21,
            BetType.STREET_16, BetType.SIX_LINE_13, BetType.SIX_LINE_16,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr18)));
        
        //19
        BetType[] nr19 = {BetType.SINGLE_19, BetType.SPLIT_16_19, BetType.SPLIT_19_20, BetType.SPLIT_19_22,
            BetType.CORNER_16_20, BetType.CORNER_19_23,
            BetType.STREET_19, BetType.SIX_LINE_19, BetType.SIX_LINE_16,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr19)));
        
        //20
        BetType[] nr20 = {BetType.SINGLE_20, BetType.SPLIT_19_20, BetType.SPLIT_20_21, BetType.SPLIT_20_23, BetType.SPLIT_17_20,
            BetType.CORNER_16_20, BetType.CORNER_17_21, BetType.CORNER_19_23,
            BetType.CORNER_20_24, BetType.STREET_19, BetType.SIX_LINE_19, BetType.SIX_LINE_16,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr20)));
        
        //21
        BetType[] nr21 = {BetType.SINGLE_21, BetType.SPLIT_18_21, BetType.SPLIT_20_21, BetType.SPLIT_21_24,
            BetType.CORNER_20_24, BetType.CORNER_17_21,
            BetType.STREET_19, BetType.SIX_LINE_16, BetType.SIX_LINE_19,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr21)));
        
        //22
        BetType[] nr22 = {BetType.SINGLE_22, BetType.SPLIT_19_22, BetType.SPLIT_22_23, BetType.SPLIT_22_25,
            BetType.CORNER_22_26, BetType.CORNER_19_23,
            BetType.STREET_22, BetType.SIX_LINE_19, BetType.SIX_LINE_22,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr22)));
        
        //23
        BetType[] nr23 = {BetType.SINGLE_23, BetType.SPLIT_20_23, BetType.SPLIT_22_23, BetType.SPLIT_23_24, BetType.SPLIT_23_26,
            BetType.CORNER_22_26, BetType.CORNER_23_27, BetType.CORNER_19_23,
            BetType.CORNER_20_24, BetType.STREET_22, BetType.SIX_LINE_19, BetType.SIX_LINE_22,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr23)));
        
        //24
        BetType[] nr24 = {BetType.SINGLE_24, BetType.SPLIT_21_24, BetType.SPLIT_23_24, BetType.SPLIT_24_27,
            BetType.CORNER_20_24, BetType.CORNER_23_27,
            BetType.STREET_22, BetType.SIX_LINE_22, BetType.SIX_LINE_19,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_13_24};
        table.add(new HashSet(Arrays.asList(nr24)));
    }

    public HashSet<BetType> getWinningBets(int nrSpun) {
        return (HashSet) table.get(nrSpun).clone();
    }
}
