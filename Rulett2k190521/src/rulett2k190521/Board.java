package rulett2k190521;

import java.util.*;

public class Board {

    private final ArrayList<HashSet<BetType>> table;

    //Ez tartja nyilván, hogy a table lista 0-36 indexei reprezentálta rulettszámok milyen fogadás esetén nyerők
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
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr1)));

        //2
        BetType[] nr2 = {BetType.SINGLE_02, BetType.FIRST_FOUR,
            BetType.TRIO_00_02, BetType.TRIO_00_03, BetType.SPLIT_01_02, BetType.SPLIT_02_03, BetType.SPLIT_02_05, BetType.CORNER_01_05,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr2)));

        //3
        BetType[] nr3 = {BetType.SINGLE_03, BetType.FIRST_FOUR,
            BetType.TRIO_00_03, BetType.SPLIT_02_03, BetType.SPLIT_03_06, BetType.CORNER_02_06,
            BetType.STREET_01, BetType.SIX_LINE_01,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr3)));

        //4
        BetType[] nr4 = {BetType.SINGLE_04, BetType.SPLIT_01_04, BetType.SPLIT_04_05, BetType.SPLIT_04_07, BetType.CORNER_01_05,
            BetType.CORNER_04_08, BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr4)));

        //5
        BetType[] nr5 = {BetType.SINGLE_05, BetType.SPLIT_02_05, BetType.SPLIT_04_05, BetType.SPLIT_05_06, BetType.SPLIT_05_08,
            BetType.CORNER_01_05, BetType.CORNER_02_06, BetType.CORNER_05_09,
            BetType.CORNER_04_08, BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr5)));

        //6
        BetType[] nr6 = {BetType.SINGLE_06, BetType.SPLIT_03_06, BetType.SPLIT_05_06, BetType.SPLIT_06_09,
            BetType.CORNER_02_06, BetType.CORNER_05_09,
            BetType.STREET_04, BetType.SIX_LINE_01, BetType.SIX_LINE_04,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr6)));

        //7
        BetType[] nr7 = {BetType.SINGLE_07, BetType.SPLIT_04_07, BetType.SPLIT_07_08, BetType.SPLIT_07_10,
            BetType.CORNER_04_08, BetType.CORNER_07_11,
            BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr7)));

        //8
        BetType[] nr8 = {BetType.SINGLE_08, BetType.SPLIT_05_08, BetType.SPLIT_07_08, BetType.SPLIT_08_09, BetType.SPLIT_08_11,
            BetType.CORNER_05_09, BetType.CORNER_07_11, BetType.CORNER_08_12,
            BetType.CORNER_04_08, BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr8)));

        //9
        BetType[] nr9 = {BetType.SINGLE_09, BetType.SPLIT_06_09, BetType.SPLIT_08_09, BetType.SPLIT_09_12,
            BetType.CORNER_08_12, BetType.CORNER_05_09,
            BetType.STREET_07, BetType.SIX_LINE_07, BetType.SIX_LINE_04,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_01_18, BetType.THIRD_01_12};
        table.add(new HashSet(Arrays.asList(nr9)));

        //10
        BetType[] nr10 = {BetType.SINGLE_10, BetType.SPLIT_07_10, BetType.SPLIT_10_11, BetType.SPLIT_10_13,
            BetType.CORNER_07_11, BetType.CORNER_10_14,
            BetType.STREET_10, BetType.SIX_LINE_07, BetType.SIX_LINE_10,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_RED,
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

        //25
        BetType[] nr25 = {BetType.SINGLE_25, BetType.SPLIT_22_25, BetType.SPLIT_25_26, BetType.SPLIT_25_28,
            BetType.CORNER_22_26, BetType.CORNER_25_29,
            BetType.STREET_25, BetType.SIX_LINE_25, BetType.SIX_LINE_22,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr25)));

        //26
        BetType[] nr26 = {BetType.SINGLE_26, BetType.SPLIT_23_26, BetType.SPLIT_25_26, BetType.SPLIT_26_29, BetType.SPLIT_26_27,
            BetType.CORNER_22_26, BetType.CORNER_23_27, BetType.CORNER_25_29,
            BetType.CORNER_26_30, BetType.STREET_25, BetType.SIX_LINE_25, BetType.SIX_LINE_22,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr26)));

        //27
        BetType[] nr27 = {BetType.SINGLE_27, BetType.SPLIT_24_27, BetType.SPLIT_26_27, BetType.SPLIT_27_30,
            BetType.CORNER_23_27, BetType.CORNER_26_30,
            BetType.STREET_25, BetType.SIX_LINE_22, BetType.SIX_LINE_25,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr27)));

        //28
        BetType[] nr28 = {BetType.SINGLE_28, BetType.SPLIT_28_29, BetType.SPLIT_28_31, BetType.SPLIT_25_28,
            BetType.CORNER_28_32, BetType.CORNER_25_29,
            BetType.STREET_28, BetType.SIX_LINE_25, BetType.SIX_LINE_28,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr28)));

        //29
        BetType[] nr29 = {BetType.SINGLE_29, BetType.SPLIT_28_29, BetType.SPLIT_29_30, BetType.SPLIT_26_29, BetType.SPLIT_29_32,
            BetType.CORNER_28_32, BetType.CORNER_29_33, BetType.CORNER_25_29,
            BetType.CORNER_26_30, BetType.STREET_28, BetType.SIX_LINE_25, BetType.SIX_LINE_28,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr29)));

        //30
        BetType[] nr30 = {BetType.SINGLE_30, BetType.SPLIT_29_30, BetType.SPLIT_30_33, BetType.SPLIT_27_30,
            BetType.CORNER_29_33, BetType.CORNER_26_30,
            BetType.STREET_28, BetType.SIX_LINE_28, BetType.SIX_LINE_25,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr30)));

        //31
        BetType[] nr31 = {BetType.SINGLE_31, BetType.SPLIT_31_32, BetType.SPLIT_28_31, BetType.SPLIT_31_34,
            BetType.CORNER_28_32, BetType.CORNER_31_35,
            BetType.STREET_31, BetType.SIX_LINE_31, BetType.SIX_LINE_28,
            BetType.COLUMN_01, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr31)));

        //32
        BetType[] nr32 = {BetType.SINGLE_32, BetType.SPLIT_31_32, BetType.SPLIT_32_33, BetType.SPLIT_26_29, BetType.SPLIT_32_35,
            BetType.CORNER_28_32, BetType.CORNER_29_33, BetType.CORNER_31_35,
            BetType.CORNER_32_36, BetType.STREET_31, BetType.SIX_LINE_31, BetType.SIX_LINE_28,
            BetType.COLUMN_02, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr32)));

        //33
        BetType[] nr33 = {BetType.SINGLE_33, BetType.SPLIT_32_33, BetType.SPLIT_30_33, BetType.SPLIT_33_36,
            BetType.CORNER_29_33, BetType.CORNER_32_36,
            BetType.STREET_31, BetType.SIX_LINE_28, BetType.SIX_LINE_31,
            BetType.COLUMN_03, BetType.NUM_ODDS, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr33)));

        //34
        BetType[] nr34 = {BetType.SINGLE_34, BetType.SPLIT_34_35, BetType.SPLIT_31_34,
            BetType.CORNER_31_35, BetType.STREET_34, BetType.SIX_LINE_31,
            BetType.COLUMN_01, BetType.NUM_EVEN, BetType.CLR_RED,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr34)));

        //35
        BetType[] nr35 = {BetType.SINGLE_35, BetType.SPLIT_34_35, BetType.SPLIT_35_36, BetType.SPLIT_32_35,
            BetType.CORNER_31_35, BetType.CORNER_32_36, BetType.STREET_34, BetType.SIX_LINE_31,
            BetType.COLUMN_02, BetType.NUM_ODDS, BetType.CLR_BLACK, BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr35)));

        //36
        BetType[] nr36 = {BetType.SINGLE_36, BetType.SPLIT_35_36, BetType.SPLIT_33_36, BetType.CORNER_32_36,
            BetType.STREET_34, BetType.SIX_LINE_31,
            BetType.COLUMN_03, BetType.NUM_EVEN, BetType.CLR_BLACK,
            BetType.HALF_19_36, BetType.THIRD_25_36};
        table.add(new HashSet(Arrays.asList(nr36)));
    }

    public HashSet<BetType> getWinningBets(int nrSpun) {
        return (HashSet) table.get(nrSpun).clone();
    }
}
