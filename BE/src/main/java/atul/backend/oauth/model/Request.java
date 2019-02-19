package atul.backend.oauth.model;

import javax.validation.Valid;
import java.io.Serializable;

public class Request<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Valid
    private HeaderModel headerModel;

    @Valid
    private T payLoad;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public HeaderModel getHeaderModel() {
        return headerModel;
    }

    public void setHeaderModel(HeaderModel headerModel) {
        this.headerModel = headerModel;
    }

    public T getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(T payLoad) {
        this.payLoad = payLoad;
    }
}
