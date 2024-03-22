package br.com.aldopassos.front_gestao_vagas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PrimeiraPaginaController {
    
    @GetMapping("/home")
    public String primeiraPaginaHtml(Model model){
        
        model.addAttribute("mensagemDaController", "Primeira mensagem vindo da controller");
        return "primeiraPagina";
    }

    @GetMapping("/login")
    public String loginCandidate(){
        return "candidate/login";
    }

    @PostMapping("/create")
    public String cadastoCandidate(Pessoa pessoa){
        System.out.println("Nome do candidato " + pessoa.nome);
        System.out.println("E-mail do candidato " + pessoa.email);
        System.out.println("Usuário do candidato " + pessoa.usuario);
        return "/candidate/login";
    }

    record Pessoa(String usuario, String email, String nome)

}
