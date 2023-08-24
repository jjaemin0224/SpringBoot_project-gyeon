package me.jjaemm.gyeon.dto;

import lombok.Getter;
import me.jjaemm.gyeon.domain.Board;

@Getter
public class BoardResponse {

    private final String title;
    private final String content;

    public BoardResponse(Board board) {
        this.title = board.getTitle();
        this.content = board.getContent();
    }

}
