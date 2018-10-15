package pers.haoming.bigtalkdesignpatten.strategy;

import pers.haoming.bigtalkdesignpatten.strategy.cashstrategy.CashContext;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.strategy
 * @class Decorator
 * @description: 策略模式（对策略抽象，封装算法）
 * @createDate 2018/10/12 15:48
 */
public class Strategy {

    private static String[] items = new String[]{"正常收费", "打八折", "打七折", "打五折", "满 300 减 100"};
    private static int selectedIndex = 3;

    public static void main(String[] args) {
        double totalPrices = 0d;
        String txtPrice = "300";
        String txtNum = "4";

        /* // 策略模式（不包括简单工厂模式设计）
        CashContext cc = null;
        switch (selectedIndex) {
            case 0:
                cc = new CashContext(new CashNormal());
                break;
            case 1:
                cc = new CashContext(new CashRebate("0.8"));
                break;
            case 2:
                cc = new CashContext(new CashRebate("0.7"));
                break;
            case 3:
                cc = new CashContext(new CashRebate("0.6"));
                break;
            case 4:
                cc = new CashContext(new CashReturn("300", "100"));
                break;
            default:
        }*/
        // 对客户端隐藏策略的超类，彻底分离策略和客户端的联系
//        CashSuper csuper = CashFactory.createCashAccept(items[selectedIndex]);
        CashContext csuper = new CashContext(items[selectedIndex]);

        totalPrices = csuper.getResult(Double.parseDouble(txtPrice) * Double.parseDouble(txtNum));

        String result = "单价：" + txtPrice + " 数量：" + txtNum + " " + items[selectedIndex] + " 合计：" + totalPrices;
        System.out.println(result);
    }
}
