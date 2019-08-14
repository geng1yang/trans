package com.xcy.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginResult {

    private int status;

    private int token;

    private String message;

    public LoginResult(int status, int token, String message) {
        this.status = status;
        this.token = token;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "UserResult{" +
                "status=" + status +
                ", token=" + token +
                ", message='" + message + '\'' +
                '}';
    }
}
