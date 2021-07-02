package pers.haoming.bigtalkdesignpattern.state.state;

import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 晚间状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class EveningState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgress();
        } else {
            if (work.getHour() < 21) {
                System.out.printf("当前时间：%s点。加班哦，疲惫至极\n", work.getHour());
            } else {
                work.setState(new SleepingState());
                work.writeProgress();
            }
        }
    }
}
