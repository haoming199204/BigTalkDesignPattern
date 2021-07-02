package pers.haoming.bigtalkdesignpattern.state.state;

import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 休息状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class RestState extends State{
    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间：%s点。下班回家了\n", work.getHour());
    }
}
