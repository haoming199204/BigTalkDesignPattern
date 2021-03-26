package pers.haoming.bigtalkdesignpattern.staticfactory.operation;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.staticfactory
 * @class Operation
 * @description:
 * @createDate 2018/10/11 16:20
 */
public abstract class Operation {

    private double numberA = 0;
    private double numberB = 0;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();

}
