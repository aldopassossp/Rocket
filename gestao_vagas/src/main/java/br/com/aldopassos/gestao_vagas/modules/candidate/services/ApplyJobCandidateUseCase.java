package br.com.aldopassos.gestao_vagas.modules.candidate.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aldopassos.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.aldopassos.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    public void execute(UUID idCandidate, UUID idJob) {
        
        this.candidateRepository.findById(idCandidate)
            .orElseThrow(() -> {throw new UserNotFoundException(); });

        this.jobRepository.findById(idJob)
            .orElseThrow(() -> { throw new JobNotFoundException(); });
    }
}
