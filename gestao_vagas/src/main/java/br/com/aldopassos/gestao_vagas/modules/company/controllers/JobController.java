package br.com.aldopassos.gestao_vagas.modules.company.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aldopassos.gestao_vagas.modules.company.dto.CreateJobDTO;
import br.com.aldopassos.gestao_vagas.modules.company.entities.JobEntity;
import br.com.aldopassos.gestao_vagas.modules.company.services.CreateJobService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/company/job")
public class JobController {
    
    @Autowired
    private CreateJobService createJobService;

    @PostMapping("/")
    @PreAuthorize("hasRole('COMPANY')")
    @Tag(name = "Vagas", description = "Informações das Vagas")
    @Operation(sumary = "Cadastro de vagas", description = "Essa função é responsável por cadastrar as vagas dentro da aplicação")
    public JobEntity create(@Valid @RequestBody CreateJobDTO createJobDTO, HttpServletRequest request){

        var companyId = request.getAttribute("company_id");
       // jobEntity.setCompanyId(UUID.fromString(companyId.toString()));

        var jobEntity = JobEntity.builder()
            .benefits(createJobDTO.getBenefits())
            .companyId(UUID.fromString(companyId.toString()))
            .description(createJobDTO.getDescription())
            .level(createJobDTO.getLevel())
            .build();

        return this.createJobService.execute(jobEntity);
    }

    public ResponseEntity<Object> listByCompany(HttpServletRequest request) {
        var companyId = request.getAttribute("company_id");
    }
}
