package pers.haoming.bigtalkdesignpattern.factory.factory;

import pers.haoming.bigtalkdesignpattern.factory.leifeng.LeiFeng;
import pers.haoming.bigtalkdesignpattern.factory.leifeng.Undergraduate;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.factory
 * @class UndergraduateFactory
 * @description:
 * @createDate 2018/10/16 9:47
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
