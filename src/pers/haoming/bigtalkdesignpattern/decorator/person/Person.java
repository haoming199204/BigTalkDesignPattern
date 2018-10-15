package pers.haoming.bigtalkdesignpattern.decorator.person;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.decorator
 * @class Person
 * @description: 人类
 * @createDate 2018/10/15 10:05
 */
public class Person {
    private String name = "";

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("装扮的%s", name);
    }
}
