package com.example.crudpractice.service;

import com.example.crudpractice.domain.BoardEntity;
import com.example.crudpractice.domain.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BoardDeleteService {
    private final BoardRepository boardRepository;

    @Transactional
    public void execute(Long id) {
        BoardEntity boardEntity = boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("해당 게시판을 찾을 수 없습니다."));
        boardRepository.delete(boardEntity);
    }
}
