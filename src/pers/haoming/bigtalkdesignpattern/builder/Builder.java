package pers.haoming.bigtalkdesignpattern.builder;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.builder
 * @class Builder
 * @description: 建造者模式
 * @createDate 2019/2/16 16:50
 */
public class Builder {
    public static void main(String[] args) {
        // 创建一个瘦子
        PersonThinBuilder pbThin = new PersonThinBuilder("Peter");
        PersonDirector pdThin = new PersonDirector(pbThin);
        pdThin.createPerson();
        pdThin.printPerson();

        // 创建一个胖子
        PersonFatBuilder pbFat = new PersonFatBuilder("Smith");
        PersonDirector pdFat = new PersonDirector(pbFat);
        pdFat.createPerson();
        pdFat.printPerson();
    }
}
