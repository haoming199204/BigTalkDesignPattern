package pers.haoming.bigtalkdesignpattern.state.state;

import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 中午状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class NoonStatus extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.printf("当前时间：%s点。饿了，午饭；犯困，午休。\n", work.getHour());
        } else {
            work.setState(new AfternoonState());
            work.writeProgress();
        }
    }
}
