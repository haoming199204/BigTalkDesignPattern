package pers.haoming.bigtalkdesignpattern.factory.factory;

import pers.haoming.bigtalkdesignpattern.factory.leifeng.LeiFeng;
import pers.haoming.bigtalkdesignpattern.factory.leifeng.Volunteer;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.factory.factory
 * @class VolunteerFactory
 * @description:
 * @createDate 2018/10/16 9:51
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
