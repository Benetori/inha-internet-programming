package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by NDS_047 on 2019-12-18.
 */

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepo;

    public List<Board> findAll() {
        List<Board> list = boardRepo.findAll();
        return list;
    }

    public void createBoard(Board board) {
        boardRepo.save(board);
    }

    public Board getOne(int b_id) {
        return boardRepo.getOne(b_id);
    }

    public void updateBoard(int b_id, Board new_board) {
        boardRepo.findById((int)b_id).map(board -> {
            board.setB_title(new_board.getB_title());
            board.setB_contents(new_board.getB_contents());
            board.setB_update_date(LocalDateTime.now());
            return boardRepo.save(board);
        }).orElseGet(()->{
            new_board.setB_id(b_id);
            return boardRepo.save(new_board);
        });
    }

    public void deleteOne(int b_id) {
        boardRepo.deleteById(b_id);
    }
}
