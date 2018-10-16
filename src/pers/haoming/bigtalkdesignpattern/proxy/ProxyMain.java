package pers.haoming.bigtalkdesignpattern.proxy;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.proxy
 * @class ProxyMain
 * @description: 代理模式
 * @createDate 2018/10/16 9:04
 */
public class ProxyMain {
    public static void main(String[] args) {
        // 客户端全程没有追求者出现
        SchoolGirl jiaojiao = new SchoolGirl("娇娇");

        Proxy daili = new Proxy(jiaojiao);

        daili.giveFlowers();
        daili.giveDolls();
        daili.giveChocolate();
    }
}
