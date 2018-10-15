package pers.haoming.bigtalkdesignpatten.decorator.finery;

import pers.haoming.bigtalkdesignpatten.decorator.person.Person;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.decorator.finery
 * @class Finery
 * @description: 服饰类
 * @createDate 2018/10/15 10:15
 */
public class Finery extends Person {
    protected Person component;

    // 打扮
    public void decorator(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
