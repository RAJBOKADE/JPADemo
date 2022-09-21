package com.example.JPA.Demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    //private Long id;
    private String title;
    private String body;
    private Long userId;

}
