package com.relief.reliefWeb.response;


import lombok.Data;

@Data
public class ApiResponse<T> {
    private int status;
    private String message;
    private T dataId;


    public ApiResponse(int status, String message, T dataId) {
        this.status = status;
        this.message = message;
        this.dataId = dataId;
    }

}
