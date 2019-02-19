package atul.backend.oauth.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usr_env", schema = "atul", catalog = "")
public class UsrEnvEntity {
    private String ssn;
    private String carMake;
    private String carModel;
    private String carMYear;
    private String movieGen;
    private String movieTitle;
    private String product;
    private String carVin;

    @Id
    @Column(name = "SSN")
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Basic
    @Column(name = "car_make")
    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    @Basic
    @Column(name = "car_model")
    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Basic
    @Column(name = "car_m_year")
    public String getCarMYear() {
        return carMYear;
    }

    public void setCarMYear(String carMYear) {
        this.carMYear = carMYear;
    }

    @Basic
    @Column(name = "movie_gen")
    public String getMovieGen() {
        return movieGen;
    }

    public void setMovieGen(String movieGen) {
        this.movieGen = movieGen;
    }

    @Basic
    @Column(name = "movie_title")
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    @Basic
    @Column(name = "product")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "carVin")
    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsrEnvEntity that = (UsrEnvEntity) o;
        return Objects.equals(ssn, that.ssn) &&
                Objects.equals(carMake, that.carMake) &&
                Objects.equals(carModel, that.carModel) &&
                Objects.equals(carMYear, that.carMYear) &&
                Objects.equals(movieGen, that.movieGen) &&
                Objects.equals(movieTitle, that.movieTitle) &&
                Objects.equals(product, that.product) &&
                Objects.equals(carVin, that.carVin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn, carMake, carModel, carMYear, movieGen, movieTitle, product, carVin);
    }
}
