package pers.haoming.bigtalkdesignpattern.state.state;

import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 睡眠状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.printf("当前时间：%s点，不行了，睡着了。", work.getHour());
    }
}
