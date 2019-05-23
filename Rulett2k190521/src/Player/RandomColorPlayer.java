package Player;

import java.util.List;
import java.util.Random;
import rulett2k190521.AbstractPlayer;
import rulett2k190521.Bet;
import rulett2k190521.BetType;

/**
 *
 * @author progmatic
 */
public class RandomColorPlayer extends AbstractPlayer {

    public RandomColorPlayer(List<BetType> possibleBets, int minBet, int maxBet, int money) {
        super(possibleBets, minBet, maxBet, money);
    }

    @Override
    protected BetType strategy() {
        Random random = new Random();
        int strategy = random.nextInt(2) + 1;
        return (strategy == 1 ? BetType.CLR_BLACK : BetType.CLR_RED);
    }

    @Override
    public Bet placeTakes() {
        int bettingMoney = (int) (Math.random() * (maxBet-minBet+1) + minBet);
        Bet newBet = new Bet(strategy(), bettingMoney);
        this.money -= bettingMoney;
        return newBet;
    }

}
