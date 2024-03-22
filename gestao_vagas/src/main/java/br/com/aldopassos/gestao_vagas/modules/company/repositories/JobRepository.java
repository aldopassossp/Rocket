package br.com.aldopassos.gestao_vagas.modules.company.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aldopassos.gestao_vagas.modules.company.entities.JobEntity;

import java.util.UUID;

public interface JobRepository extends JpaRepository<JobEntity,UUID>{
    
}
