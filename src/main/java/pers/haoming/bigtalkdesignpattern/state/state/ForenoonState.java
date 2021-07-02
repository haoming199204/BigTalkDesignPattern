package pers.haoming.bigtalkdesignpattern.state.state;

import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 上午工作状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class ForenoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.printf("当前时间：%s点。上午工作，精神百倍\n", work.getHour());
        } else {
            work.setState(new NoonStatus());
            work.writeProgress();
        }
    }
}
