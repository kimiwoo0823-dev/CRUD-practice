package com.example.crudpractice.domain;

import com.example.crudpractice.presentation.dto.request.BoardRequest;
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
    private BoardEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void BoardUpdate(BoardRequest boardRequest){
        this.title = boardRequest.getTitle();
        this.content = boardRequest.getContent();
    }
}
