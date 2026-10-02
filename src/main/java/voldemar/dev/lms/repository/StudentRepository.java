package voldemar.dev.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voldemar.dev.lms.dao.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
