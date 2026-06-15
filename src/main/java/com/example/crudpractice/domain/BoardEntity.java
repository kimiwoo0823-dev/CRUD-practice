package com.example.crudpractice.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "tbl_board")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @Builder
    public BoardEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
