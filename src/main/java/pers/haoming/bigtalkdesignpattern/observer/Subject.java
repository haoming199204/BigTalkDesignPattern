package pers.haoming.bigtalkdesignpattern.observer;

/**
 * 通知者接口
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/25
 */
public interface Subject<T> {

    void attach(BaseObserver observer);

    void detach(BaseObserver observer);

    void iNotify();

    T get();

    void set(T t);
}
