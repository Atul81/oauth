package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usr_details", schema = "atul", catalog = "")
public class UsrDetailsEntity {
    private String usrName;
    private String animal;
    private String plant;
    private String fileDesc;
    private String domain;
    private String md5;
    private String univ;
    private String slogan;
    private String jobTitle;
    private String fullName;
    private String fakeCompany;
    private String company;
    private String sha;
    private String iban;
    private String digiSeq;
    private String drugName;

    @Id
    @Column(name = "usr_name")
    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    @Basic
    @Column(name = "animal")
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Basic
    @Column(name = "plant")
    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    @Basic
    @Column(name = "file_desc")
    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }

    @Basic
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "md5")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Basic
    @Column(name = "univ")
    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    @Basic
    @Column(name = "slogan")
    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    @Basic
    @Column(name = "jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Basic
    @Column(name = "fullName")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "fakeCompany")
    public String getFakeCompany() {
        return fakeCompany;
    }

    public void setFakeCompany(String fakeCompany) {
        this.fakeCompany = fakeCompany;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    @Basic
    @Column(name = "IBAN")
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Basic
    @Column(name = "digiSeq")
    public String getDigiSeq() {
        return digiSeq;
    }

    public void setDigiSeq(String digiSeq) {
        this.digiSeq = digiSeq;
    }

    @Basic
    @Column(name = "drug_Name")
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsrDetailsEntity that = (UsrDetailsEntity) o;
        return Objects.equals(usrName, that.usrName) &&
                Objects.equals(animal, that.animal) &&
                Objects.equals(plant, that.plant) &&
                Objects.equals(fileDesc, that.fileDesc) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(md5, that.md5) &&
                Objects.equals(univ, that.univ) &&
                Objects.equals(slogan, that.slogan) &&
                Objects.equals(jobTitle, that.jobTitle) &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(fakeCompany, that.fakeCompany) &&
                Objects.equals(company, that.company) &&
                Objects.equals(sha, that.sha) &&
                Objects.equals(iban, that.iban) &&
                Objects.equals(digiSeq, that.digiSeq) &&
                Objects.equals(drugName, that.drugName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usrName, animal, plant, fileDesc, domain, md5, univ, slogan, jobTitle, fullName, fakeCompany, company, sha, iban, digiSeq, drugName);
    }
}
