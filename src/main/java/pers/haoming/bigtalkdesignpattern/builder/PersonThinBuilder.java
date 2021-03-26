package pers.haoming.bigtalkdesignpattern.builder;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.builder
 * @class PersonThinBuilder
 * @description:
 * @createDate 2019/2/16 17:05
 */
public class PersonThinBuilder extends PersonBuilder {

    public PersonThinBuilder(String name) {
        super(name);
    }

    @Override
    public void buildHead() {
        this.head = "small";
    }

    @Override
    public void buildBody() {
        this.body = "long";
    }

    @Override
    public void buildArmLeft() {
        this.leftArm = "thin";
    }

    @Override
    public void buildArmRight() {
        this.rightArm = "thin";
    }

    @Override
    public void buildLegLeft() {
        this.leftLeg = "long";
    }

    @Override
    public void buildLegRight() {
        this.rightLeg = "long";
    }
}
