package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import thuchanh.backend.models.Job;




public interface JobRepository extends JpaRepository<Job, Long> {

}
