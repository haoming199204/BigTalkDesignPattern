package pers.haoming.bigtalkdesignpattern.staticfactory;

import pers.haoming.bigtalkdesignpattern.staticfactory.operation.Operation;
import pers.haoming.bigtalkdesignpattern.staticfactory.operation.OperationFactory;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.strategy
 * @class Decorator
 * @description: 简单工厂模式
 * @createDate 2018/10/15 9:25
 */
public class StaticFactory {

    public static void main(String[] args) {
        // write your code here
        try {
            String strNumberA = "1";
            String strOperate = "/";
            String strNumberB = "0";
            String strResult = "";

            // 操作符对象工厂，根据操作符生成不同的操作符对象（多态性）
            Operation operation = OperationFactory.createOperation(strOperate);
            if (operation == null) {
                throw new Exception("操作符不存在");
            }
            operation.setNumberA(Double.parseDouble(strNumberA));
            operation.setNumberB(Double.parseDouble(strNumberB));

            strResult = String.valueOf(operation.getResult());

            System.out.println("结果是：" + strResult);
        } catch (Exception e) {
            System.out.println("您的输入有错:" + e.getMessage());
        }
    }
}
