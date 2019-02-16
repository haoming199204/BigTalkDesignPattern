package pers.haoming.bigtalkdesignpattern.builder;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.builder
 * @class PersonDirector
 * @description: 人的指挥者
 * @createDate 2019/2/16 17:07
 */
public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson() {
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }

    public void printPerson() {
        System.out.println(pb);
    }
}
