package pers.haoming.bigtalkdesignpattern.builder;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.builder
 * @class PersonFatBuilder
 * @description:
 * @createDate 2019/2/16 17:11
 */
public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(String name) {
        super(name);
    }

    @Override
    public void buildHead() {
        this.head = "big";
    }

    @Override
    public void buildBody() {
        this.body = "short";
    }

    @Override
    public void buildArmLeft() {
        this.leftArm = "strong";
    }

    @Override
    public void buildArmRight() {
        this.rightArm = "strong";
    }

    @Override
    public void buildLegLeft() {
        this.leftLeg = "short";
    }

    @Override
    public void buildLegRight() {
        this.rightLeg = "short";
    }
}
