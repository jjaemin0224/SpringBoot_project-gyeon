package me.jjaemm.gyeon.controller;

import lombok.RequiredArgsConstructor;
import me.jjaemm.gyeon.dto.BoardViewResponse;
import me.jjaemm.gyeon.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardViewController {

    private final BoardService boardService;

    @GetMapping("/boards")
    public String getBoards(Model model) {
        List<BoardViewResponse> boardList = boardService.findAll()
                .stream()
                .map(BoardViewResponse::new)
                .toList();
        model.addAttribute("boardList", boardList);

        return "boardList";
    }

}
