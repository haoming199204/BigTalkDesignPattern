package pers.haoming.bigtalkdesignpatten.staticfactory;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.staticfactory
 * @class OperationDiv
 * @description:
 * @createDate 2018/10/11 16:30
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
