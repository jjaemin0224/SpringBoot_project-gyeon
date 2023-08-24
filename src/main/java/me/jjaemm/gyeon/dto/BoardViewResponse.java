package me.jjaemm.gyeon.dto;

import lombok.Getter;
import me.jjaemm.gyeon.domain.Board;

@Getter
public class BoardViewResponse {

    private final long id;
    private final String title;
    private final String content;

    public BoardViewResponse(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
    }

}
