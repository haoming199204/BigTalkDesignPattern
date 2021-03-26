package pers.haoming.bigtalkdesignpattern.proxy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.proxy
 * @class Proxy
 * @description: 代理人
 * @createDate 2018/10/16 9:09
 */
public class Proxy implements GiveGift {

    private Pursuit pursuit;

    public Proxy(SchoolGirl mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
