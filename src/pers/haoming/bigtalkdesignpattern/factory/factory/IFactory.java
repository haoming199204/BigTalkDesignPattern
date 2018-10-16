package pers.haoming.bigtalkdesignpattern.factory.factory;

import pers.haoming.bigtalkdesignpattern.factory.leifeng.LeiFeng;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.factory
 * @class IFactory
 * @description: 工厂接口（抽象类）
 * @createDate 2018/10/16 9:45
 */
public interface IFactory {
    LeiFeng createLeiFeng();
}
