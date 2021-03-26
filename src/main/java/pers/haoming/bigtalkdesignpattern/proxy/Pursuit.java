package pers.haoming.bigtalkdesignpattern.proxy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.proxy
 * @class Pursuit
 * @description: 追求者
 * @createDate 2018/10/16 9:08
 */
public class Pursuit implements GiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + " 送你鲜花！");
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() + " 送你玩偶！");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + " 送你巧克力！");
    }
}
