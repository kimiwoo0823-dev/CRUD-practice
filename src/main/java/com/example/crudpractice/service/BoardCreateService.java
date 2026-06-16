package com.example.crudpractice.service;

import com.example.crudpractice.domain.BoardEntity;
import com.example.crudpractice.domain.repository.BoardRepository;
import com.example.crudpractice.presentation.dto.request.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardCreateService {
    private final BoardRepository boardRepository;

    @Transactional
    public void execute(BoardRequest boardRequest) {
        BoardEntity boardEntity = BoardEntity.builder()
                .title(boardRequest.getTitle())
                .content(boardRequest.getContent())
                .build();

        boardRepository.save(boardEntity);
    }
}
