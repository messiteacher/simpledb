package com.ll.simpleDb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    private long id;
    private String title;
    private String body;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    @JsonProperty("isBlind")
    private boolean isBlind;

    public static Article fromMap(Map<String, Object> map) {

        return new Article(
                (long) map.get("id"),
                (String) map.get("title"),
                (String) map.get("body"),
                (LocalDateTime) map.get("createdDate"),
                (LocalDateTime) map.get("modifiedDate"),
                (boolean) map.get("isBlind")
        );
    }
}
