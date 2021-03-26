package pers.haoming.bigtalkdesignpattern.strategy.cashstrategy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.strategy
 * @class CashContext
 * @description: 策略上下文
 * @createDate 2018/10/12 18:58
 */
public class CashContext {
    CashSuper cs;

    public CashContext(String type) {
        // 简单工厂模式
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "打八折":
                CashRebate cr1 = new CashRebate("0.8");
                cs = cr1;
                break;
            case "打七折":
                CashRebate cr2 = new CashRebate("0.7");
                cs = cr2;
                break;
            case "打五折":
                CashRebate cr3 = new CashRebate("0.5");
                cs = cr3;
                break;
            case "满 300 减 100":
                CashReturn cr4 = new CashReturn("300", "100");
                cs = cr4;
                break;
            default:
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
