package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "department", schema = "atul", catalog = "")
public class DepartmentEntity {
    private Integer id;
    private String departmentRetail;
    private String drugCompany;
    private String app;
    private String countryCode;
    private String ctDate;
    private String dept;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "department_retail")
    public String getDepartmentRetail() {
        return departmentRetail;
    }

    public void setDepartmentRetail(String departmentRetail) {
        this.departmentRetail = departmentRetail;
    }

    @Basic
    @Column(name = "drug_company")
    public String getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(String drugCompany) {
        this.drugCompany = drugCompany;
    }

    @Basic
    @Column(name = "app")
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
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
    @Column(name = "dept")
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(departmentRetail, that.departmentRetail) &&
                Objects.equals(drugCompany, that.drugCompany) &&
                Objects.equals(app, that.app) &&
                Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(ctDate, that.ctDate) &&
                Objects.equals(dept, that.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departmentRetail, drugCompany, app, countryCode, ctDate, dept);
    }
}
