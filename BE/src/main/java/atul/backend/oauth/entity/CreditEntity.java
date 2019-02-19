package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "credit", schema = "atul", catalog = "")
public class CreditEntity {
    private Integer id;
    private String currrency;
    private String currCode;
    private String creditCard;
    private String country;
    private String ctDate;
    private String ccType;
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
    @Column(name = "currrency")
    public String getCurrrency() {
        return currrency;
    }

    public void setCurrrency(String currrency) {
        this.currrency = currrency;
    }

    @Basic
    @Column(name = "curr_code")
    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    @Basic
    @Column(name = "credit_card")
    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "ct_date")
    public String getCtDate() {
        return ctDate;
    }

    public void setCtDate(String ctDate) {
        this.ctDate = ctDate;
    }

    @Basic
    @Column(name = "cc_type")
    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
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
        CreditEntity that = (CreditEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(currrency, that.currrency) &&
                Objects.equals(currCode, that.currCode) &&
                Objects.equals(creditCard, that.creditCard) &&
                Objects.equals(country, that.country) &&
                Objects.equals(ctDate, that.ctDate) &&
                Objects.equals(ccType, that.ccType) &&
                Objects.equals(money, that.money) &&
                Objects.equals(bitcoin, that.bitcoin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currrency, currCode, creditCard, country, ctDate, ccType, money, bitcoin);
    }
}
