package pers.haoming.bigtalkdesignpattern.observer;

/**
 * 看股票的同事
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/25
 */
public class StockObserver extends BaseObserver {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    public void update() {
        System.out.printf("%s %s 关闭股票行情，继续工作！", sub.get(), name);
    }
}
