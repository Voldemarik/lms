package voldemar.dev.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import voldemar.dev.lms.dao.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
