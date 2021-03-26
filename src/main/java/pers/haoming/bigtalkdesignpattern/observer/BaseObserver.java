package pers.haoming.bigtalkdesignpattern.observer;

/**
 * 基础观察者
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/25
 */
public abstract class BaseObserver {

    protected String name;
    protected Subject sub;

    public BaseObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
