package pers.haoming.bigtalkdesignpattern.facade;

import pers.haoming.bigtalkdesignpattern.facade.fund.Fund;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.facade
 * @class Facade
 * @description: 外观模式
 * @createDate 2018/10/16 11:44
 */
public class Facade {
    public static void main(String[] args) {
        // 只需考虑购买基金，而不需要考虑具体购买哪种具体的金融产品（依赖倒转）
        Fund fund = new Fund();

        fund.buyFund();

        fund.sellFund();
    }
}
