package backend.embedded.tomcat.v2.controller;

import backend.embedded.tomcat.v1.model.BoardEntity;
import backend.embedded.tomcat.v1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardControllerV2 {

    @Autowired
    BoardService boardService;

    @GetMapping(value="/v2")
    public Object main(Model model){
        List<BoardEntity> boardAll = boardService.findBoardAll();


        return boardAll;
    }

    @PostMapping(value="/v2")
    public String write(@RequestParam String content){
        boardService.createBoard(content);
        return "redirect:/v2";
    }
}
