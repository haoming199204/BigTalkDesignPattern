package pers.haoming.bigtalkdesignpattern.strategy.cashstrategy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.strategy
 * @class CashReturn
 * @description:
 * @createDate 2018/10/12 16:34
 */
public class CashReturn extends CashSuper {
    private double moneyConditon = 0d;
    private double moneyReturn = 0d;

    public CashReturn(String moneyConditon, String moneyReturn) {
        this.moneyConditon = Double.parseDouble(moneyConditon);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = 0d;
        if (money >= moneyConditon) {
            result = money - Math.floor(money / moneyConditon) * moneyReturn;
        }
        return result;
    }
}
