package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "atul", catalog = "")
public class CountryEntity {
    private String id;
    private String ein;
    private String curency;
    private String creditCard;
    private String countryCode;
    private String ctDate;
    private String country;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ein")
    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    @Basic
    @Column(name = "curency")
    public String getCurency() {
        return curency;
    }

    public void setCurency(String curency) {
        this.curency = curency;
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
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryEntity that = (CountryEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ein, that.ein) &&
                Objects.equals(curency, that.curency) &&
                Objects.equals(creditCard, that.creditCard) &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(ctDate, that.ctDate) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ein, curency, creditCard, countryCode, ctDate, country);
    }
}
