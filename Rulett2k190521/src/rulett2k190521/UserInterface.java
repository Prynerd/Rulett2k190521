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
public class UserInterface {

    private Casino cs;

    public UserInterface() {
        cs = new Casino();

    }

    public void mainMenu() {
        do {
            String[] mainM = {"Interaktív játék", "Szimuláció"};
            int path = choosePath(mainM, "a főmenüből?", "Kilyen játékot kíván játszani?");
            switch (path) {
                case 2:
                    simulatedGame();
                    break;
                case 1:

                    livePlayerMain();
                    break;
                default:
                    break;
            }
        } while (!exit("a programból"));
        System.out.println("Köszönjük a játékot!");
    }

    private int choosePath(String[] choices, String menu, String title) {
        boolean correct = false;
        int k = 0;

        do {
            System.out.println(title);
            for (int i = 0; i < choices.length; i++) {
                System.out.printf("   %-7d%s%n", (i + 1), choices[i]);
            }
            System.out.printf("   %-7s%s%n", "Más", "Kilép");
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                k = Integer.parseInt(s);
                if (k > 0 && k <= choices.length) {
                    correct = true;
                } else {
                    correct = exit(menu);
                    k = 0;
                }
            } catch (NumberFormatException e) {
                correct = exit(menu);
                k = 0;
            }
        } while (!correct);
        return k;
    }

    private int choosePath(String[] choices, String title) {
        boolean correct = false;
        int k = 0;

        do {
            System.out.println(title);
            for (int i = 0; i < choices.length; i++) {
                System.out.printf("   %-7d%s%n", (i + 1), choices[i]);
            }
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                k = Integer.parseInt(s);
                if (k > 0 && k <= choices.length) {
                    correct = true;
                } else {
                    System.out.println("Sajnos mindenképpen a listáról kell megadnia egy számot !");
                    correct = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sajnos mindenképpen meg kell adnia egy számot!");
                correct = false;
            }
        } while (!correct);
        return k;
    }

    private boolean exit(String loc) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Kilép %s?  i/n%n", loc);
        String s = scn.nextLine();
        return s.toUpperCase().equals("I");
    }

    private void livePlayerMain() {
        cs.newPlayer(askNr("a kezdőtőkét"));
        do {
            String[] liveMain = {"Számra", "Vízszintes párra", "Függőleges párra",
                 "Sorra", "Négyesre", "Sorpárra", "Oszlopra", "Tucatra", "Magasra-alacsonyra",
                 "Páros-páratlanra", "Színre"}; //11
            int path = choosePath(liveMain, "a tétek menüjéből", "Mire kíván fogadni?");
            switch (path) {
                case 1:
                    int num = 0;
                    do {
                        num = askNr("a kívánt számot 0 és 36 között");
                        if (num > 36) {
                            System.out.println("Ilyen szám nincs a táblán!");
                        }
                    } while (num > 36);
                    livePlayerGame(findEnum("SIN", (num + 1)), askStakes());
                    break;
                case 2:
                    String[] hspl = {"1-2", "2-3", "4-5", "5-6", "7-8", "8-9", "10-11",
                         "11-12", "13-14", "14-15", "16-17", "17-18", "19-20",
                         "20-21", "22-23", "23-24", "25-26", "26-27", "28-29",
                         "29-30", "31-32", "32-33", "34-35", "35-36"};
                    livePlayerGame(findEnum("SPL", choosePath(hspl,
                             "Melyik párosra tesz?")), askStakes());
                    break;
                case 3:
                    String[] vspl = {"1-4", "2-5", "3-6", "4-7", "5-8", "6-9", "7-10",
                         "8-11", "9-12", "10-13", "11-14", "12-15", "13-14",
                         "15-18", "16-19", "17-20", "18-21", "19-22", "20-23",
                         "21-24", "22-25", "23-26", "24-27", "25-28", "26-29",
                         "27-30", "28-31", "29-32", "30-33", "31-34", "32-35", "33-36"};
                    livePlayerGame(findEnum("SPL", choosePath(vspl,
                             "Melyik párosra tesz?") + 24), askStakes());
                    break;
                case 4:
                    String[] tri = {"1--3", "4--6", "7--9", "10--12",
                         "13--15", "16--18", "19--21", "22--24", "25--27", "28--30",
                         "31--33", "34--36", "0-1-2", "0-2-3"};
                    livePlayerGame(findEnum("STR", choosePath(tri,
                             "Melyik sorra vagy számhármasra tesz?")), askStakes());
                    break;
                case 5:
                    String[] four = {"1-5", "2-6", "4-8", "5-9", "7-11",
                         "8-12", "10-14", "11-15", "13-17", "14-18", "16-20", "17-21",
                         "19-23", "20-24", "22-26", "23-27", "25-29", "26-30",
                         "28-32", "29-33", "31-35", "32-36", "0-1-2-3"};
                    livePlayerGame(findEnum("COR", choosePath(four,
                             "Melyik sarokra tesz?")), askStakes());
                    break;
                case 6:
                    String[] six = {"1--6", "4--9", "7--12", "10--15", "13--18",
                         "16--21", "19--24", "22--27", "25--30", "28--33", "31--36"};
                    livePlayerGame(findEnum("SIX", choosePath(six,
                             "Melyik sorpárra tesz?")), askStakes());
                    break;
                case 7:
                    String[] col = {"Bal", "Közép", "Jobb"};
                    livePlayerGame(findEnum("COL", choosePath(col,
                             "Melyik oszlopra tesz?")), askStakes());
                    break;
                case 8:
                    String[] th = {"1--12", "13--24", "25--36"};
                    livePlayerGame(findEnum("THI", choosePath(th,
                             "Melyik tucatra fogad?")), askStakes());
                    break;
                case 9:
                    String[] ha = {"1--18", "19--36"};
                    livePlayerGame(findEnum("HAL", choosePath(ha,
                             "Magas vagy mély számokra fogad?")), askStakes());
                    break;
                case 10:
                    String[] nu = {"Páratlan", "Páros"};
                    livePlayerGame(findEnum("NUM", choosePath(nu,
                             "Párosra vagy páratlanra fogad?")), askStakes());
                    break;
                case 11:
                    String[] clr = {"Piros", "Fekete"};
                    livePlayerGame(findEnum("CLR", choosePath(clr,
                             "Melyik színre fogad?")), askStakes());
                    break;
                default:
                    break;
            }
        } while (!exit("a játékból"));

    }

    private void livePlayerGame(BetType x, int y) {

        cs.getPlayer().setBet(new Bet(x , y));
        cs.simulation();
    }

    private void simulatedGame() {
        int[] details = askDetails();
        cs.newPlayer(details[0], details[1], details[2], details[3]);
        cs.game(details[4]);
    }

    private BetType findEnum(String key, int nr) {
        if (key.equals("STR") && nr == 13) {
            return BetType.TRIO_00_02;
        } else if (key.equals("STR") && nr == 14) {
            return BetType.TRIO_00_03;
        } else if (key.equals("COR") && nr == 23) {
            return BetType.FIRST_FOUR;
        }
        int idx = nr - 1;
        BetType[] all = BetType.values();
        ArrayList<BetType> relevant = new ArrayList<>();
        for (int i = 0; i < all.length; i++) {
            String nom = all[i].toString();
            if (nom.substring(0, 3).equals(key)) {
                relevant.add(all[i]);
            }
        }
        return relevant.get(idx);

    }

    private int askStakes() {
        int k = 0;
        boolean correct = false;
        do {
            System.out.println("Mekkora téttel játszik?");
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                k = Integer.parseInt(s);
                if (k > 0) {
                    correct = true;
                } else {
                    System.out.println("Sajnos ekkora téttel nem játszhat!");
                    correct = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("Sajnos mindenképpen meg kell adnia egy tétet!");
                correct = false;
            }
        } while (!correct);
        return k;
    }

    private int[] askDetails() {
        int minStake = 0;
        int maxStake = 0;
        int rounds = 0;
        int playerStrat = 0;
        int money = 0;
        minStake = askNr("a legkisebb tétet");
        do {
            maxStake = askNr("a legnagyobb tétet");
            if (minStake > maxStake) {
                System.out.println("A lehető legnagyobb nem lehet kisebb a legkisebbnél!");
            }
        } while (minStake > maxStake);
        do {
            money = askNr("a kezdőtőkét");
            if (money < minStake) {
                System.out.println("A kezdőtőke nem lehet kisebb a legkisebb tétnél!");
            }
        } while (money < minStake);
        do {
            rounds = askNr("a játékkörök számát");
            if (rounds < 1) {
                System.out.println("Legalább egy kört meg kell adnia!");
            }
        } while (rounds < 1);
        String[] playerTypes = {"Tetszőleges szín", "Véletlenszerű", "Visszafogott",
             "Martingél Béla"};
        playerStrat = choosePath(playerTypes, "Milyen szisztémája legyen a játékosnak?");
        int[] data = {playerStrat, minStake, maxStake, money, rounds};
        return data;
    }

    private int askNr(String nm) {
        int nr = 0;
        boolean correct = false;
        do {
            System.out.printf("Kérem, adja meg %s:%n", nm);
            Scanner sc = new Scanner(System.in);
            try {
                String s = sc.nextLine();
                nr = Integer.parseInt(s);
                if (nr < 0) {
                    System.out.println("Ez a szám sajnos túl kicsi!");
                    correct = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sajnos mindenképpen meg kell adnia egy számot!");
                correct = false;
            }
        } while (!correct);
        return nr;
    }

}
