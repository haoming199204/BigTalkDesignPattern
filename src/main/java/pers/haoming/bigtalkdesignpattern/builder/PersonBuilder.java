package pers.haoming.bigtalkdesignpattern.builder;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.builder
 * @class PersonBuilder
 * @description: 人
 * @createDate 2019/2/16 16:54
 */
public abstract class PersonBuilder {
    protected String name;
    protected String head;
    protected String body;
    protected String leftArm;
    protected String rightArm;
    protected String leftLeg;
    protected String rightLeg;

    public PersonBuilder(String name) {
        this.name = name;
        this.head = "none";
        this.body = "none";
        this.leftArm = "none";
        this.rightArm = "none";
        this.leftLeg = "none";
        this.rightLeg = "none";
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

    @Override
    public String toString() {
        return "person(" + this.name + ")[head: " + this.head + ", body: " + this.body
                + ", leftArm: " + this.leftArm + ", rightArm: " + this.rightArm
                + ", leftLeg: " + this.leftLeg + ", rightLeg: " + this.rightLeg + "]";
    }
}
