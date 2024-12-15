package thuchanh.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thuchanh.backend.models.Experience;
import thuchanh.backend.repositories.ExperienceRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExperienceService {
    @Autowired
    private ExperienceRepository experienceRepository;
    public Experience save(Experience experience) {
        return experienceRepository.save(experience);
    }

    public List<Experience> findByCanId(Long id) {
        return experienceRepository.findByCandidate_Id(id);
    }
    public boolean isExperienceOverlap(LocalDate from, LocalDate to) {
        if(experienceRepository.findExperienceOverlap(from, to).isPresent()){
            return true;
        }
        return false;
    }
    public List<Experience> findByCandidateId(Long id) {
        return experienceRepository.findByCandidate_Id(id);
    }
}
