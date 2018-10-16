package pers.haoming.bigtalkdesignpattern.prototype.resume;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.prototype.resume
 * @class WorkExperience
 * @description: 工作经历类
 * @createDate 2018/10/16 11:06
 */
public class WorkExperience implements Cloneable {
    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
