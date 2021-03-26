package pers.haoming.bigtalkdesignpattern.staticfactory.operation;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.staticfactory
 * @class OperationDiv
 * @description: 操作符对象 - 除法
 * @createDate 2018/10/11 16:30
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
