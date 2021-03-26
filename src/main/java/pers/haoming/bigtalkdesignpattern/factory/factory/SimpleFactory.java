package pers.haoming.bigtalkdesignpattern.factory.factory;

import pers.haoming.bigtalkdesignpattern.factory.leifeng.LeiFeng;
import pers.haoming.bigtalkdesignpattern.factory.leifeng.Undergraduate;
import pers.haoming.bigtalkdesignpattern.factory.leifeng.Volunteer;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.factory.factory
 * @class SimpleFactory
 * @description: 简单工厂类
 * @createDate 2018/10/16 9:55
 */
@Deprecated
public class SimpleFactory {
    public LeiFeng createLeiFeng(String type) {
        LeiFeng result = null;
        switch (type) {
            case "学雷锋的大学生":
                result = new Undergraduate();
                break;
            case "社区志愿者":
                result = new Volunteer();
                break;
            default:
        }

        return result;
    }
}
