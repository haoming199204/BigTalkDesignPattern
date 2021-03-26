package pers.haoming.bigtalkdesignpattern.prototype.resume;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.prototype
 * @class Resume
 * @description: 简历类
 * @createDate 2018/10/16 10:39
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    // 引用如果直接被复制，会有两个简历对象同时更改一个引用的工作经历对象的隐患
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        // 深复制工作经历
        this.work = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        work.setTimeArea(timeArea);
        work.setCompany(company);
    }

    public void display() {
        System.out.printf("%s %s %s \n", name, sex, age);
        System.out.printf("工作经历：%s %s \n", work.getTimeArea(), work.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 新构建一个简历类，并调用私有构造方法，深复制工作经历信息
        Resume result = new Resume(work);
        result.name = this.name;
        result.age = this.age;
        result.sex = this.sex;

        return result;
    }
}
