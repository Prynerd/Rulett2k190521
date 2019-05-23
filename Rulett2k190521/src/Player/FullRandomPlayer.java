/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import java.util.List;
import java.util.Random;
import rulett2k190521.AbstractPlayer;
import rulett2k190521.Bet;
import rulett2k190521.BetType;

/**
 *
 * @author N007
 */
public class FullRandomPlayer extends AbstractPlayer {

    public FullRandomPlayer(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        super(possibleBets, minBet, maxBet, money);
    }

    @Override
    protected BetType strategy() {
        int pick = new Random().nextInt(BetType.values().length);
        return BetType.values()[pick];
    }

    @Override
    public Bet placeTakes() {
       int bettingMoney = (int) (Math.random() * (maxBet-minBet+1) + minBet);
        Bet newBet = new Bet(strategy(),bettingMoney);
        this.money -= bettingMoney;
        return newBet;
    }

}
