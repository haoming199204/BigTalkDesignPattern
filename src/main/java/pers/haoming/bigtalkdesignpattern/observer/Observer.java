package pers.haoming.bigtalkdesignpattern.observer;

/**
 * 观察者模式客户端
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/25
 */
public class Observer {
    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver stockObserver = new StockObserver("张三", boss);

        NBAObserver nbaObserver = new NBAObserver("李四", boss);

        boss.attach(stockObserver);
        boss.attach(nbaObserver);

        boss.detach(nbaObserver);

        boss.set("老板我回来了！");

        boss.iNotify();
    }
}
