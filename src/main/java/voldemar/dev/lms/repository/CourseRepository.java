package voldemar.dev.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voldemar.dev.lms.dao.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
