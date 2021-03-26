package pers.haoming.bigtalkdesignpattern.decorator.finery;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.decorator.finery
 * @class Tshirt
 * @description:
 * @createDate 2018/10/15 10:17
 */
public class Tshirt extends Finery {
    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
