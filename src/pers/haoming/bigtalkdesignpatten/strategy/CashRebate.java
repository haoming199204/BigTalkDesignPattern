package pers.haoming.bigtalkdesignpatten.strategy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.strategy
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
