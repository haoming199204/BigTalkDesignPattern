package pers.haoming.bigtalkdesignpattern.abstractfactory.factory;

import pers.haoming.bigtalkdesignpattern.abstractfactory.department.IDepartment;
import pers.haoming.bigtalkdesignpattern.abstractfactory.department.SqlServerDepartment;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.IUser;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.SqlServerUser;

/**
 * SqlServer工厂类
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class SqlServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}
