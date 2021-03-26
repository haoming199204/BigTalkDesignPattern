package pers.haoming.bigtalkdesignpattern.abstractfactory.user;

/**
 * 用户
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
