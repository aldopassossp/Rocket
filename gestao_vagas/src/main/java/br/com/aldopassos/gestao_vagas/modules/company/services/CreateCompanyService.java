package br.com.aldopassos.gestao_vagas.modules.company.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.aldopassos.gestao_vagas.exceptions.UserFoundException;
import br.com.aldopassos.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.aldopassos.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyService {
    
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public CompanyEntity execute(CompanyEntity companyEntity){

        this.companyRepository
            .findByUserNameOrEmail(companyEntity.getUserName(), companyEntity.getEmail())
            .ifPresent((user) -> {
                throw new UserFoundException();
            });
            
            var password = passwordEncoder.encode(companyEntity.getPassword());
            companyEntity.setPassword(password);
            System.out.println(password);

        return this.companyRepository.save(companyEntity);

    }
}
