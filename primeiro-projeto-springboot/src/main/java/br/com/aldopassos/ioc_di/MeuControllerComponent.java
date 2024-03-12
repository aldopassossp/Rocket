package br.com.aldopassos.ioc_di;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponent meuComponent;
    
    @GetMapping("/")
    public String chamandoComponent(){
        var meuComponent = new MeuComponent();
        var resultado = meuComponent.chamarMeuComponent();

        return resultado;
    }
    
}
