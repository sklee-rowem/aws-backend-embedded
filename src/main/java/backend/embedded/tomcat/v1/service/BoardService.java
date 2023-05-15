package backend.embedded.tomcat.v1.service;

import backend.embedded.tomcat.v1.model.BoardEntity;
import backend.embedded.tomcat.v1.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {


    @Autowired
    private BoardRepository boardRepository;

    public void createBoard(String content){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setContent(content);

        boardRepository.save(boardEntity);

    }

    public BoardEntity findBoardById(Long id){
        BoardEntity boardEntity = boardRepository.findById(id).orElseThrow();
        return boardEntity;
    }

    public List<BoardEntity> findBoardAll(){
        List<BoardEntity> all = boardRepository.findAll();
        return all;
    }




}
