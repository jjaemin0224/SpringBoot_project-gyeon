package me.jjaemm.gyeon.service;

import lombok.RequiredArgsConstructor;
import me.jjaemm.gyeon.domain.Board;
import me.jjaemm.gyeon.dto.UpdateBoardRequest;
import me.jjaemm.gyeon.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    // 전체 게시판
    public List<Board> findAll() {

        return boardRepository.findAll();
    }

    public Board findById(long id) {

        return boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found : " + id));
    }

    public void delete(long id) {
        boardRepository.deleteById(id);
    }

    public Board update(long id, UpdateBoardRequest request) {
        Board board = findById(id);
        board.update(request.getTitle(), request.getContent());

        return board;
    }

}
