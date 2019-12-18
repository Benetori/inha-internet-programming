package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by NDS_047 on 2019-12-18.
 */

@Controller
public class BoardController {
    @Autowired
    BoardService service;

    @GetMapping("/board")
    public ModelAndView boardList() {
        List<Board> list = service.findAll();
        ModelAndView nextView = new ModelAndView("board/list");
        nextView.addObject("boardList", list);
        return nextView;
    }
}
