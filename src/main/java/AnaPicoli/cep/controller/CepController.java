package AnaPicoli.cep.controller;

import AnaPicoli.cep.model.Endereco;
import AnaPicoli.cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        return cepService.buscarEnderecoPorCep(cep);
    }
}