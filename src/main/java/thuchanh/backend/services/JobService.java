package thuchanh.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thuchanh.backend.enums.StatusPostJob;
import thuchanh.backend.models.Job;
import thuchanh.backend.repositories.JobRepository;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public List<Job> findByCompanyId(long companyId) {
        return  jobRepository.findJobsByCompany_Id(companyId);
    }
    public Job save(Job job) {
        return jobRepository.save(job);
    }

    public void close(long jobId, StatusPostJob status) {
        jobRepository.updateStatusById(status,jobId);
    }

    public Optional<Job> findById(Long jobId) {
        return jobRepository.findById(jobId);
    }

    public List<Job> suggestJob(Long candidateId) {
        return jobRepository.suggestJobByCandidateId(candidateId);
    }
}
