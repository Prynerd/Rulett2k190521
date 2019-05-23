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
    boolean isFirstPlay;
    int previousMoney;

    public Martingel(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        super(possibleBets, minBet, maxBet, money);
        this.previousBet = minBet;
        this.isWonBefore = false;
        this.isFirstPlay = true;
        this.previousMoney = minBet;
    }

    @Override
    protected BetType strategy() {
        return BetType.CLR_RED;
    }

    @Override
    public Bet placeTakes() {
        if (this.previousMoney < this.money) {
            isWonBefore = true;
        }
        if (isWonBefore) {
            Bet dontWantToPlay = new Bet(null, -1);
            return dontWantToPlay;
        }
        if (isFirstPlay) {
            int bettingMoney = minBet;
            Bet firstBet = new Bet(strategy(), bettingMoney);
            this.money -= bettingMoney;
            this.previousBet = bettingMoney;
            this.isFirstPlay = false;
            return firstBet;
        }
        int bettingMoney = previousBet * 2;
        if (bettingMoney > maxBet) {
            bettingMoney = maxBet;
        }
        Bet newBet = new Bet(strategy(), bettingMoney);
        this.money -= bettingMoney;
        this.previousMoney = this.money;
        this.previousBet = bettingMoney;
        return newBet;
    }

}
