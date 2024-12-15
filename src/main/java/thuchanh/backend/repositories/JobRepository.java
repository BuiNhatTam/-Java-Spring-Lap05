package thuchanh.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import thuchanh.backend.enums.StatusPostJob;
import thuchanh.backend.models.Job;

import java.util.List;


public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findJobsByCompany_Id(long companyId);

    void updateStatusById(StatusPostJob status, long jobId);

    List<Job> suggestJobByCandidateId(Long candidateId);
}
