package pers.haoming.bigtalkdesignpatten.staticfactory.operation;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.staticfactory
 * @class OperationMul
 * @description:
 * @createDate 2018/10/11 16:30
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
