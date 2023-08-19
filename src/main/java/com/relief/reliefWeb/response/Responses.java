package com.relief.reliefWeb.response;


import lombok.Data;

@Data
public class Responses<T> {
    private int status;
    private String message;
    private T dataId;


    public Responses(int status, String message, T dataId) {
        this.status = status;
        this.message = message;
        this.dataId = dataId;
    }

}
