package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thuchanh.backend.models.JobSkill;
import thuchanh.backend.models.Skill;

public interface JobSkillRepository extends JpaRepository<JobSkill, Skill> {
}