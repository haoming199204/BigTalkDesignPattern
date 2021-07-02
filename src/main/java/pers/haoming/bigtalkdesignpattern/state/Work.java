package pers.haoming.bigtalkdesignpattern.state;

import pers.haoming.bigtalkdesignpattern.state.state.ForenoonState;
import pers.haoming.bigtalkdesignpattern.state.state.State;

/**
 * 工作类
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public class Work {
    private State state;

    private int hour;

    private boolean finish;

    public Work() {
        this.state = new ForenoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgress() {
        this.state.writeProgram(this);
    }
}
