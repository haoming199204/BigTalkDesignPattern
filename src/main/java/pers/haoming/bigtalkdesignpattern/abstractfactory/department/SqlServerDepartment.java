package pers.haoming.bigtalkdesignpattern.abstractfactory.department;

/**
 * SqlServer部门操作类
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class SqlServerDepartment implements IDepartment{
    @Override
    public void insert(Department department) {
        System.out.println("在 SQL Server 中给 Department 表增加一条记录！");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 SQL Server 中根据ID得到 Department 表的一条记录！");
        return null;
    }
}
