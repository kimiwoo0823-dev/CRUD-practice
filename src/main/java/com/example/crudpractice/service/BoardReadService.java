package com.example.crudpractice.service;

import com.example.crudpractice.domain.BoardEntity;
import com.example.crudpractice.domain.repository.BoardRepository;
import com.example.crudpractice.presentation.dto.response.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardReadService {
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public List<BoardResponse> execute() {
        List<BoardEntity> boardEntity = boardRepository.findAll();

        List<BoardResponse> boardResponse = boardEntity.stream()
                .map(BoardResponse::new)
                .toList();

        return boardResponse;
    }
}
