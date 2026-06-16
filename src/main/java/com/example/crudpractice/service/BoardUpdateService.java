package com.example.crudpractice.service;

import com.example.crudpractice.domain.BoardEntity;
import com.example.crudpractice.domain.repository.BoardRepository;
import com.example.crudpractice.presentation.dto.request.BoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardUpdateService {
    private final BoardRepository boardRepository;

    @Transactional
    public void execute(Long id, BoardRequest boardRequest) {
        BoardEntity board = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("게시물이 존재하지 않습니다"));
        board.BoardUpdate(boardRequest);
    }
}
