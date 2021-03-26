package pers.haoming.bigtalkdesignpattern.strategy.cashstrategy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.strategy
 * @class CashRebate
 * @description:
 * @createDate 2018/10/12 16:34
 */
public class CashRebate extends CashSuper {
    private double moneyRebate;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
