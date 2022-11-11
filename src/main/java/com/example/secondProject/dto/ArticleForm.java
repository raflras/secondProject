package com.example.secondProject.dto;

import com.example.secondProject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ArticleForm {

    private String title;
    private String content;


    public Article toEntity() {
        return new Article(null, title, content);
    }
}
