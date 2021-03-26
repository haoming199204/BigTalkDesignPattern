package pers.haoming.bigtalkdesignpattern.abstractfactory.factory;

import pers.haoming.bigtalkdesignpattern.abstractfactory.department.IDepartment;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.IUser;

/**
 * 抽象工厂接口
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
