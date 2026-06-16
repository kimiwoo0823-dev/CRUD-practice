package com.example.crudpractice.presentation.dto.response;

import com.example.crudpractice.domain.BoardEntity;
import lombok.Getter;

@Getter
public class BoardResponse {
    private final Long id;
    private final String title;
    private final String content;

    public BoardResponse(BoardEntity boardEntity) {
        this.id = boardEntity.getId();
        this.title = boardEntity.getTitle();
        this.content = boardEntity.getContent();
    }
}
