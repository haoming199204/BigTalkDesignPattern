package pers.haoming.bigtalkdesignpatten.decorator;

import pers.haoming.bigtalkdesignpatten.decorator.finery.*;
import pers.haoming.bigtalkdesignpatten.decorator.person.Person;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpatten.decorator
 * @class Decorator
 * @description: 装饰模式
 * @createDate 2018/10/15 10:09
 */
public class Decorator {
    /**
     * 装饰模式：需要对原有对象新加修饰性质的方法时使用的模式
     * 可以把核心功能和装饰功能区分开
     */
    public static void main(String[] args) {
        Person xm = new Person("小明");

        System.out.println("\n 第一种装扮：");
        Finery tshirt = new Tshirt();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();
        // 非装饰模式
        tshirt.show();
        bigTrouser.show();
        sneakers.show();
        xm.show();

        System.out.println("\n 第二种装扮：");
        Suit suit = new Suit();
        Tie tie = new Tie();
        LeatherShoes leatherShoes = new LeatherShoes();
        /*suit.show();
        tie.show();
        leatherShoes.show();
        xm.show();*/
        // 装饰模式，通过对父类方法的重写，达到修饰效果
        suit.decorator(xm);
        tie.decorator(suit);
        leatherShoes.decorator(tie);
        leatherShoes.show();
    }
}
