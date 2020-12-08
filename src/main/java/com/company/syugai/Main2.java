package com.company.syugai;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"firstName\":\"Alexandr\",\"secondName\":\"Yugay\",\"sex\":true,\"birthday\":\"2002-11-07\",\"gpa\":3.5}";
        ObjectMapper m = new ObjectMapper();
        Student student = m.readValue(json, Student.class);
    }
}
