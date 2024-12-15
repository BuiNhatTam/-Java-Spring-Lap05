package thuchanh.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thuchanh.backend.repositories.JobSkillRepository;
import thuchanh.backend.models.JobSkill;
@Service
public class JobSkillService {
    @Autowired
    private JobSkillRepository jobSkillRepository;
    public JobSkill save(JobSkill jobSkill) {
        return jobSkillRepository.save(jobSkill);
    }
}
