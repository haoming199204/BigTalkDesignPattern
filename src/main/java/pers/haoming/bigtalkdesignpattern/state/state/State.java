package pers.haoming.bigtalkdesignpattern.state.state;


import pers.haoming.bigtalkdesignpattern.state.Work;

/**
 * 状态
 *
 * @author hm
 * @version 1.0
 * @date 2021/3/26
 */
public abstract class State {
    public abstract void writeProgram(Work work);
}
