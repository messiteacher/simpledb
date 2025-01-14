package com.ll.simpleDb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.lang.reflect.Field;
import java.util.Map;

public class Util {

    public static <T> T mapToObj(Map<String, Object> map, Class<T> cls) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        return mapper.convertValue(map, cls);
    }

//    public static <T> T mapToObj(Map<String, Object> map, Class<T> cls) {
//
//        try {
//
//            T instance = cls.getDeclaredConstructor().newInstance();
//
//            for (Map.Entry<String, Object> entry : map.entrySet()) {
//
//                String fieldName = entry.getKey();
//                Object value = entry.getValue();
//
//                Field field = cls.getDeclaredField(fieldName);
//                field.setAccessible(true);
//
//                field.set(instance, value);
//            }
//
//            return instance;
//        } catch (Exception e) {
//            throw new RuntimeException("인스턴스 생성 실패: " + e.getMessage(), e);
//        }
//    }
}
