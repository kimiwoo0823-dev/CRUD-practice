package com.example.crudpractice.presentation;

import com.example.crudpractice.presentation.dto.request.BoardRequest;
import com.example.crudpractice.presentation.dto.response.BoardResponse;
import com.example.crudpractice.service.BoardCreateService;
import com.example.crudpractice.service.BoardDeleteService;
import com.example.crudpractice.service.BoardReadService;
import com.example.crudpractice.service.BoardUpdateService;
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
    private final BoardDeleteService boardDeleteService;
    private final BoardUpdateService boardUpdateService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody BoardRequest boardRequest) {
        boardCreateService.execute(boardRequest);
    }

    @GetMapping("/read")
    @ResponseStatus(HttpStatus.OK)
    public List<BoardResponse> read() {
        return boardReadService.execute();
    }

    @DeleteMapping("/delete/{boardId}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long boardId) {
        boardDeleteService.execute(boardId);
    }

    @PatchMapping("/update/{boardId}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long boardId, @RequestBody BoardRequest boardRequest) {
        boardUpdateService.execute(boardId, boardRequest);
    }
}
