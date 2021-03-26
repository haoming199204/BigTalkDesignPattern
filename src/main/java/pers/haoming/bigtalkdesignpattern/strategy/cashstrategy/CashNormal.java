package pers.haoming.bigtalkdesignpattern.strategy.cashstrategy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.strategy
 * @class CashNormal
 * @description:
 * @createDate 2018/10/12 16:33
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
