package pers.haoming.bigtalkdesignpattern.template;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.template
 * @class TestPaper
 * @description: 试卷
 * @createDate 2019/2/16 16:23
 */
public abstract class TestPaper {
    public void testQuestion() {
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }

    public void testQuestion1() {
        System.out.println("1. 杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是【 】");
        System.out.println("a. 球磨铸铁");
        System.out.println("b. 马口铁");
        System.out.println("c. 高速合金钢");
        System.out.println("d. 碳素纤维");
        System.out.println("答案：" + answer1());
    }

    public void testQuestion2() {
        System.out.println("2. 杨过、程英、陆无双铲除了情花，造成【 】");
        System.out.println("a. 使这种植物不再害人");
        System.out.println("b. 使一种珍惜物种灭绝");
        System.out.println("c. 破坏了那个生物圈的生态平衡");
        System.out.println("d. 造成该地区沙漠化");
        System.out.println("答案：" + answer2());
    }

    public void testQuestion3() {
        System.out.println("3. 蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药【 】");
        System.out.println("a. 阿司匹林");
        System.out.println("b. 牛黄解毒片");
        System.out.println("c. 氟哌酸");
        System.out.println("d. 让他们喝大量的生牛奶");
        System.out.println("e. 以上全不对");
        System.out.println("答案：" + answer3());
    }

    public abstract String answer1();

    public abstract String answer2();

    public abstract String answer3();
}
