package com.example.GalleryService.entity;

public class ErrorDetails {
    private int status;
    private String message;

    public ErrorDetails(int status, String message) {
        this.status = status;
        this.message = message;
    }
    public ErrorDetails(){}


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
