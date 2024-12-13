package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thuchanh.backend.models.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}