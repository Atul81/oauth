package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock", schema = "atul", catalog = "")
public class StockEntity {
    private Integer id;
    private String stockMarket;
    private String stockSector;
    private String stockSymbol;
    private String stockName;
    private String stockIndus;
    private String stockMarketCap;
    private String money;
    private String bitcoin;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stock_market")
    public String getStockMarket() {
        return stockMarket;
    }

    public void setStockMarket(String stockMarket) {
        this.stockMarket = stockMarket;
    }

    @Basic
    @Column(name = "stock_sector")
    public String getStockSector() {
        return stockSector;
    }

    public void setStockSector(String stockSector) {
        this.stockSector = stockSector;
    }

    @Basic
    @Column(name = "stock_symbol")
    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    @Basic
    @Column(name = "stock_name")
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Basic
    @Column(name = "stock_indus")
    public String getStockIndus() {
        return stockIndus;
    }

    public void setStockIndus(String stockIndus) {
        this.stockIndus = stockIndus;
    }

    @Basic
    @Column(name = "stock_market_cap")
    public String getStockMarketCap() {
        return stockMarketCap;
    }

    public void setStockMarketCap(String stockMarketCap) {
        this.stockMarketCap = stockMarketCap;
    }

    @Basic
    @Column(name = "money")
    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Basic
    @Column(name = "bitcoin")
    public String getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(String bitcoin) {
        this.bitcoin = bitcoin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockEntity that = (StockEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(stockMarket, that.stockMarket) &&
                Objects.equals(stockSector, that.stockSector) &&
                Objects.equals(stockSymbol, that.stockSymbol) &&
                Objects.equals(stockName, that.stockName) &&
                Objects.equals(stockIndus, that.stockIndus) &&
                Objects.equals(stockMarketCap, that.stockMarketCap) &&
                Objects.equals(money, that.money) &&
                Objects.equals(bitcoin, that.bitcoin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stockMarket, stockSector, stockSymbol, stockName, stockIndus, stockMarketCap, money, bitcoin);
    }
}
