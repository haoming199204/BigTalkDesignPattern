package pers.haoming.bigtalkdesignpattern.abstractfactory;

import pers.haoming.bigtalkdesignpattern.abstractfactory.department.IDepartment;
import pers.haoming.bigtalkdesignpattern.abstractfactory.department.Department;
import pers.haoming.bigtalkdesignpattern.abstractfactory.factory.IFactory;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.IUser;
import pers.haoming.bigtalkdesignpattern.abstractfactory.user.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * 抽象工厂
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class AbstractFactory {
    private static final String RESOURCE_BASE_NAME = "application";

    private static final String RESOURCE_FACTORY_PROPERTY_KEY = "db.factory.class";

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {


        // 抽象工厂
//        IFactory iFactory = new SqlServerFactory();
//        IFactory iFactory = new AccessFactory();

        // 反射
        // 获取配置的数据库工厂类名称
        ResourceBundle bundle = ResourceBundle.getBundle(RESOURCE_BASE_NAME);
        String dbFactoryClass = bundle.getString(RESOURCE_FACTORY_PROPERTY_KEY);
        // 查找构建类
        Constructor<?>[] constructors = ClassLoader.getSystemClassLoader()
                .loadClass(dbFactoryClass)
                .getDeclaredConstructors();
        // 构建实例
        IFactory iFactory = (IFactory) Arrays.stream(constructors).findFirst().orElseThrow().newInstance();

        // 用户操作
        IUser iu = iFactory.createUser();
        User user = iu.getUser(0);
        iu.insert(user);

        // 部门操作
        IDepartment id = iFactory.createDepartment();
        Department department = id.getDepartment(0);
        id.insert(department);
    }
}
