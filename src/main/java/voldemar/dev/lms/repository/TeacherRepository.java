package voldemar.dev.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voldemar.dev.lms.dao.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
