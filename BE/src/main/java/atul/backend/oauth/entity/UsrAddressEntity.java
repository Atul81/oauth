package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usr_address", schema = "atul", catalog = "")
public class UsrAddressEntity {
    private String carVin;
    private String city;
    private String country;
    private String countryCd;
    private String lat;
    private String lng;
    private String phone;
    private String postalCode;
    private String state;
    private String stateCd;
    private String streetAdd;
    private String streetName;
    private String streetNum;
    private String streetSuf;
    private String timeZone;
    private String ctDate;
    private String time;
    private String usrName;

    @Id
    @Column(name = "carVin")
    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    @Column(name = "country_cd")
    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    @Basic
    @Column(name = "lat")
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "lng")
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "state_cd")
    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    @Basic
    @Column(name = "street_add")
    public String getStreetAdd() {
        return streetAdd;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }

    @Basic
    @Column(name = "street_name")
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Basic
    @Column(name = "street_num")
    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    @Basic
    @Column(name = "street_suf")
    public String getStreetSuf() {
        return streetSuf;
    }

    public void setStreetSuf(String streetSuf) {
        this.streetSuf = streetSuf;
    }

    @Basic
    @Column(name = "timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
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
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "usr_name")
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsrAddressEntity that = (UsrAddressEntity) o;
        return Objects.equals(carVin, that.carVin) &&
                Objects.equals(city, that.city) &&
                Objects.equals(country, that.country) &&
                Objects.equals(countryCd, that.countryCd) &&
                Objects.equals(lat, that.lat) &&
                Objects.equals(lng, that.lng) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(postalCode, that.postalCode) &&
                Objects.equals(state, that.state) &&
                Objects.equals(stateCd, that.stateCd) &&
                Objects.equals(streetAdd, that.streetAdd) &&
                Objects.equals(streetName, that.streetName) &&
                Objects.equals(streetNum, that.streetNum) &&
                Objects.equals(streetSuf, that.streetSuf) &&
                Objects.equals(timeZone, that.timeZone) &&
                Objects.equals(ctDate, that.ctDate) &&
                Objects.equals(time, that.time) &&
                Objects.equals(usrName, that.usrName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carVin, city, country, countryCd, lat, lng, phone, postalCode, state, stateCd, streetAdd, streetName, streetNum, streetSuf, timeZone, ctDate, time, usrName);
    }
}
