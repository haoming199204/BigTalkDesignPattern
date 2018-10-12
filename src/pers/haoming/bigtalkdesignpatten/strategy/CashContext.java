package pers.haoming.bigtalkdesignpatten.strategy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.strategy
 * @class CashContext
 * @description:
 * @createDate 2018/10/12 18:58
 */
public class CashContext extends CashSuper {
    CashSuper cs;

    public CashContext(String type) {
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

    @Override
    public double acceptCash(double money) {
        return cs.acceptCash(money);
    }
}
