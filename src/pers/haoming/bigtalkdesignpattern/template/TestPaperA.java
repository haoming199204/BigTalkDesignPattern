package pers.haoming.bigtalkdesignpattern.template;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.template
 * @class TestPaperA
 * @description:
 * @createDate 2019/2/16 16:35
 */
public class TestPaperA extends TestPaper {

    @Override
    public String answer1() {
        return "b";
    }

    @Override
    public String answer2() {
        return "c";
    }

    @Override
    public String answer3() {
        return "a";
    }
}
