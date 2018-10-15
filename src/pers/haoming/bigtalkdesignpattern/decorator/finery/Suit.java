package pers.haoming.bigtalkdesignpattern.decorator.finery;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.decorator.finery
 * @class Suit
 * @description:
 * @createDate 2018/10/15 10:21
 */
public class Suit extends Finery {
    @Override
    public void show() {
        System.out.print("西装 ");
        super.show();
    }
}
