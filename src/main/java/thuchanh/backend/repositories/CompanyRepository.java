package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thuchanh.backend.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}