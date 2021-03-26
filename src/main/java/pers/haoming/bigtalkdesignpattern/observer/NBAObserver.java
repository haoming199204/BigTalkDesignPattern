package pers.haoming.bigtalkdesignpattern.observer;

/**
 * 看NBA的同事
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/25
 */
public class NBAObserver extends BaseObserver {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    public void update() {
        System.out.printf("%s %s 关闭NBA直播，继续工作！", sub.get(), name);
    }
}
