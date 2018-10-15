package pers.haoming.bigtalkdesignpattern.staticfactory.operation;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.staticfactory
 * @class OperationSub
 * @description:
 * @createDate 2018/10/11 16:29
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
