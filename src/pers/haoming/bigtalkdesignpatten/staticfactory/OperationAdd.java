package pers.haoming.bigtalkdesignpatten.staticfactory;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.staticfactory
 * @class OperationAdd
 * @description:
 * @createDate 2018/10/11 16:29
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
