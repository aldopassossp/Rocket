package br.com.aldopassos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/primeiraController")
public class PrimeiroController {
    
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
       return "O parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
       return "O parametro é " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metroComBodyParams(@RequestBody Usuario usuario){
        return "metodoComBodyParams " + usuario.nome;
    }

    @PostMapping("/metodoComHeaders")
    public String metroComHeaders(@RequestHeader("name") String name){
        return "metodoComHeader " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers){
        return "metodoComHeader " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){

        var usuario = new Usuario("aldopassos");

        if(id > 5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Número menor que 5!");
    }

    record Usuario(String nome){}
}
