package pers.haoming.bigtalkdesignpattern.template;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.template
 * @class TestPaperB
 * @description: B同学的试卷
 * @createDate 2019/2/16 16:36
 */
public class TestPaperB extends TestPaper {

    @Override
    public String answer1() {
        return "c";
    }

    @Override
    public String answer2() {
        return "a";
    }

    @Override
    public String answer3() {
        return "a";
    }
}
