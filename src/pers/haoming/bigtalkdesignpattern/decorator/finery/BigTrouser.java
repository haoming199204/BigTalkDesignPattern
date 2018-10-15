package pers.haoming.bigtalkdesignpattern.decorator.finery;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.decorator.finery
 * @class BigTrouser
 * @description:
 * @createDate 2018/10/15 10:19
 */
public class BigTrouser extends Finery {

    @Override
    public void show() {
        // 在调用super.show()方法之前执行的操作，相当于在父类之前使用修饰方法
        System.out.print("垮裤 ");
        super.show();
    }
}
