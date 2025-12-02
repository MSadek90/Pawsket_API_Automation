package com.example.utils;

import com.example.Pojo.RegisterRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;



public class JsonReader {
 

   
    private static ObjectMapper mapper = new ObjectMapper();

    public static <T> T readJson(String filePath, Class<T> clazz) {
        try {
            return mapper.readValue(new File(filePath), clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to read JSON: " + filePath, e);
        }
    }
}


