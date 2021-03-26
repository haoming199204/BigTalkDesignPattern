package pers.haoming.bigtalkdesignpattern.abstractfactory.department;

/**
 * 操作部门类
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public interface IDepartment {
    void insert(Department department);

    Department getDepartment(int id);
}
