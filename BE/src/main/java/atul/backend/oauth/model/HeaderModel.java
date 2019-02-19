package atul.backend.oauth.model;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("header")
public class HeaderModel {

    private String appName;
    private String userId;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResponseDateTime() {
        return responseDateTime;
    }

    public void setResponseDateTime(String responseDateTime) {
        this.responseDateTime = responseDateTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getUserAction() {
        return userAction;
    }

    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String responseDateTime;
    private String language;

    private String sessionToken;
    private String userAction;
    private String status;

    @Override
    public String toString() {
        return "HeaderModel" + appName + " " + userId + " " + responseDateTime + " " + language + " " + sessionToken + " " + userAction + " " + status;
    }
}
