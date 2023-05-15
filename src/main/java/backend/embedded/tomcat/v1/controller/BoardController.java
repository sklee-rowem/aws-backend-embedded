package backend.embedded.tomcat.v1.controller;

import backend.embedded.tomcat.v1.model.BoardEntity;
import backend.embedded.tomcat.v1.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping(value="/")
    public String main(Model model){
        List<BoardEntity> boardAll = boardService.findBoardAll();

        model.addAttribute("boardAll",boardAll);
        return "main";
    }

    @PostMapping(value="/")
    public String write(@RequestParam String content){
        boardService.createBoard(content);
        return "redirect:/";
    }



}
