package br.com.alura.geradorFrases.Controllers;

import br.com.alura.geradorFrases.Model.dto.FraseDto;
import br.com.alura.geradorFrases.Service.FrasesServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FrasesController {

    @Autowired
    private FrasesServico servico;

    @GetMapping("/frases")
    public FraseDto retornarFraseAleatoria(){
        return servico.buscarFraseAleatoria();
    }
}
