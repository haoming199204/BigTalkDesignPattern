package pers.haoming.bigtalkdesignpattern.abstractfactory.user;

/**
 * Access用户
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 Access 中给 User 表增加一条记录！");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 Access 中根据ID得到 User 表的一条记录！");
        return new User();
    }
}
