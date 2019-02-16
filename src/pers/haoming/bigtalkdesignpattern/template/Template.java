package pers.haoming.bigtalkdesignpattern.template;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.template
 * @class Template
 * @description: 策略模式
 * @createDate 2019/2/16 16:20
 */
public class Template {
    public static void main(String[] args) {
        // A和B两位同学做同一张试卷
        TestPaper studentA = new TestPaperA();
        TestPaper studentB = new TestPaperB();

        System.out.println("A同学做答：");
        studentA.testQuestion();

        System.out.println("\nB同学做答：");
        studentB.testQuestion();
    }
}
