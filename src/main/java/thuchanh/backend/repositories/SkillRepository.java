package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thuchanh.backend.models.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
