package com.amul.question_service.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
