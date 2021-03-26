package pers.haoming.bigtalkdesignpattern.abstractfactory.factory;

import pers.haoming.bigtalkdesignpattern.abstractfactory.department.IDepartment;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.AccessUser;
import pers.haoming.bigtalkdesignpattern.abstractfactory.department.AccessDepartment;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.IUser;

/**
 * Access工厂
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
