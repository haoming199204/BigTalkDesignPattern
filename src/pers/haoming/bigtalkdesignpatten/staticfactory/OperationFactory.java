package pers.haoming.bigtalkdesignpatten.staticfactory;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.staticfactory
 * @class OperationFactory
 * @description:
 * @createDate 2018/10/11 16:49
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation oper;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationMul();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                oper = null;
        }
        return oper;
    }
}
