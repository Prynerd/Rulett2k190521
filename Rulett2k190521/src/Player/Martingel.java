/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.List;
import rulett2k190521.AbstractPlayer;
import rulett2k190521.Bet;
import rulett2k190521.BetType;

/**
 *
 * @author N007
 */
public class Martingel extends AbstractPlayer {

    int previousBet;
    boolean isWonBefore;

    public Martingel(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        super(possibleBets, minBet, maxBet, money);
        this.previousBet = minBet;
        this.isWonBefore = false;
    }

    @Override
    protected BetType strategy() {
        return BetType.CLR_RED;
    }

    @Override
    public Bet placeTakes() {
        if (isWonBefore) {
            Bet dontWantToPlay = new Bet(null, 0);
            return dontWantToPlay;
        }
        int bettingMoney = previousBet * 2;
        Bet newBet = new Bet(strategy(), bettingMoney);
        this.money -= bettingMoney;
        this.previousBet += bettingMoney;
        return newBet;
    }

}
