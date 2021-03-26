package pers.haoming.bigtalkdesignpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/25
 */
public class Boss implements Subject<String>{

    List<BaseObserver> list = new ArrayList<>();

    private String action;

    @Override
    public void attach(BaseObserver observer) {
        list.add(observer);
    }

    @Override
    public void detach(BaseObserver observer) {
        list.remove(observer);
    }

    @Override
    public void iNotify() {
        list.forEach(BaseObserver::update);
    }

    @Override
    public String get() {
        return action;
    }

    @Override
    public void set(String action) {
        this.action = action;
    }
}
