package LessonDatajpa.repository;
import LessonDatajpa.lesson.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName (String name);

    List<User> findAllByName(String name);
}
