package pers.haoming.bigtalkdesignpattern.abstractfactory.user;

/**
 * SqlServer用户操作类
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class SqlServerUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("在 SQL Server 中给 User 表增加一条记录！");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 SQL Server 中根据ID得到 User 表的一条记录！");
        return new User();
    }
}
