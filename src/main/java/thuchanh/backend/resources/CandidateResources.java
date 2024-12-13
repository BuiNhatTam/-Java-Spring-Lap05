package thuchanh.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import thuchanh.backend.services.CandidateServices;

@RestController("/api/vi")
public class CandidateResources {
    @Autowired
    private CandidateServices services;
}
