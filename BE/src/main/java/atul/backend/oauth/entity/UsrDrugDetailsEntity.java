package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "usr_drug_details", schema = "atul", catalog = "")
public class UsrDrugDetailsEntity {
    private String drugName;
    private String drugCom;
    private byte[] drugNameGen;
    private String createdDate;
    private String shortHex;
    private byte[] url;
    private String timezone;
    private String createdTime;
    private String hexColor;
    private String duns;

    @Basic
    @Column(name = "drug_Name")
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Basic
    @Column(name = "drug_Com")
    public String getDrugCom() {
        return drugCom;
    }

    public void setDrugCom(String drugCom) {
        this.drugCom = drugCom;
    }

    @Basic
    @Column(name = "drug_Name_Gen", columnDefinition="blob")
    public byte[] getDrugNameGen() {
        return drugNameGen;
    }

    public void setDrugNameGen(byte[] drugNameGen) {
        this.drugNameGen = drugNameGen;
    }

    @Basic
    @Column(name = "created_date")
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "short_hex")
    public String getShortHex() {
        return shortHex;
    }

    public void setShortHex(String shortHex) {
        this.shortHex = shortHex;
    }

    @Basic
    @Column(name = "url", columnDefinition="blob")
    public byte[] getUrl() {
        return url;
    }

    public void setUrl(byte[] url) {
        this.url = url;
    }

    @Basic
    @Column(name = "timezone")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Id
    @Column(name = "hex_color")
    public String getHexColor() {
        return hexColor;
    }

    public void setHexColor(String hexColor) {
        this.hexColor = hexColor;
    }

    @Basic
    @Column(name = "duns")
    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsrDrugDetailsEntity that = (UsrDrugDetailsEntity) o;
        return Objects.equals(drugName, that.drugName) &&
                Objects.equals(drugCom, that.drugCom) &&
                Arrays.equals(drugNameGen, that.drugNameGen) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(shortHex, that.shortHex) &&
                Arrays.equals(url, that.url) &&
                Objects.equals(timezone, that.timezone) &&
                Objects.equals(createdTime, that.createdTime) &&
                Objects.equals(hexColor, that.hexColor) &&
                Objects.equals(duns, that.duns);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(drugName, drugCom, createdDate, shortHex, timezone, createdTime, hexColor, duns);
        result = 31 * result + Arrays.hashCode(drugNameGen);
        result = 31 * result + Arrays.hashCode(url);
        return result;
    }
}
