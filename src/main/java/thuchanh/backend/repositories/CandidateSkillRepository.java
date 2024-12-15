package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thuchanh.backend.models.CandidateSkill;
import thuchanh.backend.models.Skill;

import java.util.List;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Skill> {

}