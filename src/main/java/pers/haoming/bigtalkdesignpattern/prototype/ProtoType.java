package pers.haoming.bigtalkdesignpattern.prototype;

import pers.haoming.bigtalkdesignpattern.prototype.resume.Resume;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.prototype
 * @class ProtoType
 * @description: 原型模式
 * @createDate 2018/10/16 10:24
 */
public class ProtoType {
    public static void main(String[] args) throws Exception {
        Resume resumeA = new Resume("小明");
        resumeA.setPersonalInfo("男", "26");
        resumeA.setWorkExperience("2014.7 - 2017.5", "Hand");
        resumeA.display();
        // 浅复制
//        Resume resumeB = resumeA;
//        resumeB.setWorkExperience("2017.6 - 2018.10", "Inspur");
//        resumeB.display();
        // 第一张简历的内容变成第二张的了
//        resumeA.display();

        // 深复制
        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setWorkExperience("2017.6 - 2018.10", "Inspur");
        resumeB.display();
        // 检查原简历信息
        resumeA.display();

    }
}
