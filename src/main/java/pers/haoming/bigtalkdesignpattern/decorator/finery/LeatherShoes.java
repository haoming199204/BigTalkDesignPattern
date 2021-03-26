package pers.haoming.bigtalkdesignpattern.decorator.finery;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.decorator.finery
 * @class LeatherShoes
 * @description:
 * @createDate 2018/10/15 10:23
 */
public class LeatherShoes extends Finery {
    @Override
    public void show() {
        System.out.print("皮鞋 ");
        super.show();
    }
}
