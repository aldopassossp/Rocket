package br.com.aldopassos.gestao_vagas.modules.company.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aldopassos.gestao_vagas.exceptions.CompanyNotFoundException;
import br.com.aldopassos.gestao_vagas.modules.company.entities.JobEntity;
import br.com.aldopassos.gestao_vagas.modules.company.repositories.CompanyRepository;
import br.com.aldopassos.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobService {
    
    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public JobEntity execute(JobEntity jobEntity){
        companyRepository.findById(jobEntity.getCompanyId()).orElseThrow( () -> {
            throw new CompanyNotFoundException();
        });
        return this.jobRepository.save(jobEntity);
    }
}
