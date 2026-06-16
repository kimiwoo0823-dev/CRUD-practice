package com.example.crudpractice.presentation;

import com.example.crudpractice.presentation.dto.request.BoardRequest;
import com.example.crudpractice.presentation.dto.response.BoardResponse;
import com.example.crudpractice.service.BoardCreateService;
import com.example.crudpractice.service.BoardReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardCreateService boardCreateService;
    private final BoardReadService boardReadService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody BoardRequest boardRequest) {
        boardCreateService.execute(boardRequest);
    }

    @GetMapping("/read")
    public List<BoardResponse> read() {
        return boardReadService.execute();
    }
}
