package backend.embedded.tomcat.v1.repository;


import backend.embedded.tomcat.v1.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity,Long> {

}
