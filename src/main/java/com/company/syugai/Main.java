package com.company.syugai;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student("Alexandr", "Yugay", true, "2002-11-07", 3.5);
        ObjectMapper m = new ObjectMapper();
        System.out.println(m.writeValueAsString(student));
    }
}
