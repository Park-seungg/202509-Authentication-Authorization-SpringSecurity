package com.back.post.post.entity;

import global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Post extends BaseEntity {
    private String title;
    private  String content;
}