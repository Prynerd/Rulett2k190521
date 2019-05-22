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
public class ShyPlayer extends AbstractPlayer {

    public ShyPlayer(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        super(possibleBets, minBet, maxBet, money);
    }

    @Override
    protected BetType strategy() {
        return BetType.CLR_RED;
    }

    @Override
    protected Bet placeTakes() {
        Bet newBet = new Bet(strategy(), minBet);
        this.money -= minBet;
        return newBet;
    }

}
