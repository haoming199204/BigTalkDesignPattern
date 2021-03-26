package pers.haoming.bigtalkdesignpattern.abstractfactory.user;

/**
 * 操作用户接口
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}
