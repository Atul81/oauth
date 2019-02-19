package atul.backend.oauth.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private HeaderModel headerModel;

    @JsonProperty(value = "responseBody")
    private T response;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public HeaderModel getHeaderModel() {
        return headerModel;
    }

    public void setHeaderModel(HeaderModel headerModel) {
        this.headerModel = headerModel;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
