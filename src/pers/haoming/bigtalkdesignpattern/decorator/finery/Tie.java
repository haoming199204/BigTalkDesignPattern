package pers.haoming.bigtalkdesignpattern.decorator.finery;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.decorator.finery
 * @class Tie
 * @description:
 * @createDate 2018/10/15 10:22
 */
public class Tie extends Finery {
    @Override
    public void show() {
        System.out.print("领带 ");
        super.show();
    }
}
