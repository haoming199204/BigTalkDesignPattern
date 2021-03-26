package pers.haoming.bigtalkdesignpattern.staticfactory.operation;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.staticfactory
 * @class OperationAdd
 * @description: 操作符对象 - 假发
 * @createDate 2018/10/11 16:29
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
