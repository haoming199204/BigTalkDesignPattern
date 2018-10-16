package pers.haoming.bigtalkdesignpattern.facade.fund;

/**
 * @author haoming
 * @package pers.haoming.bigtalkdesignpattern.facade
 * @class Fund
 * @description: 基金类
 * @createDate 2018/10/16 13:50
 */
public class Fund {
    private Stock stock;
    private NationalDebt nationalDebt;
    private Realty realty;

    public Fund() {
        this.stock = new Stock();
        this.nationalDebt = new NationalDebt();
        this.realty = new Realty();
    }

    public void buyFund() {
        stock.buy();
        nationalDebt.buy();
        realty.buy();
    }

    public void sellFund() {
        stock.sell();
        nationalDebt.sell();
        realty.sell();
    }
}
