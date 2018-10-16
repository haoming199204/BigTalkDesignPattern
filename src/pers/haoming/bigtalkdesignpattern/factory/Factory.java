package pers.haoming.bigtalkdesignpattern.factory;

import pers.haoming.bigtalkdesignpattern.factory.factory.IFactory;
import pers.haoming.bigtalkdesignpattern.factory.factory.VolunteerFactory;
import pers.haoming.bigtalkdesignpattern.factory.leifeng.LeiFeng;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.factory
 * @class Factory
 * @description: 工厂模式
 * @createDate 2018/10/16 9:30
 */
public class Factory {
    public static void main() {
        // 与简单工厂不同，工厂模式将条件判断放到客户端
//        LeiFeng studentA = new Undergraduate();
        // 使用工厂模式：
        // 1. 可以直接替换调用的工厂，达到更换产品的效果
        // 2. 可以避免直接修改工厂类，直接实现工厂接口即可
//        IFactory factory = new UndergraduateFactory();
        IFactory factory = new VolunteerFactory();

        LeiFeng studentA = factory.createLeiFeng();

        studentA.sweep();
        studentA.wash();
        studentA.buyRice();

    }
}
