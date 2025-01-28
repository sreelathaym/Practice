package com.spring.Practice;

public class HelloResponse {
    //through this class will get json structure in postman for get call

    public HelloResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

}
