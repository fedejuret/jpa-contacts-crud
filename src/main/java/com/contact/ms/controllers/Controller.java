package com.contact.ms.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;

public class Controller {

    public Object successResponse(Object data, int statusCode) {

        Map<String, Object> response = new HashMap<String, Object>();
        response.put("data", data);
        response.put("code", statusCode);

        return ResponseEntity.status(statusCode).body(response);
    }

    public Object errorResponse(String message, int statusCode) {

        Map<String, Object> response = new HashMap<String, Object>();
        response.put("error", message);
        response.put("code", statusCode);

        return ResponseEntity.status(statusCode).body(response);
    }

}
