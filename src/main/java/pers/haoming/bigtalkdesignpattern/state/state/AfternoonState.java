package pers.haoming.bigtalkdesignpattern.state.state;

import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 下午状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class AfternoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.printf("当前时间：%s点。下午状态还不错，继续努力！\n", work.getHour());
        } else {
            work.setState(new EveningState());
            work.writeProgress();
        }
    }
}
