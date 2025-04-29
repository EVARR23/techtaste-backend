package Projeto.para.compra.de.alimento.controller;

import Projeto.para.compra.de.alimento.model.Cadastro;
import Projeto.para.compra.de.alimento.repository.CadastroRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cadastro")
@AllArgsConstructor
<<<<<<< HEAD
@CrossOrigin(origins = "http://localhost:56335")
=======
>>>>>>> 8dbe713f0e61788864eb93283b55a9b916270916
public class CadastroController {
    private final CadastroRepository cadastroRepository;
    @GetMapping
    public List <Cadastro> list() {
        return cadastroRepository.findAll();
    }
<<<<<<< HEAD

=======
>>>>>>> 8dbe713f0e61788864eb93283b55a9b916270916
  @PostMapping("/add")
  public Cadastro addCadastro (@RequestBody Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
  }

    @PutMapping("/update")
    public Cadastro updateCadastro(@RequestBody Cadastro cadastro){
<<<<<<< HEAD

=======
>>>>>>> 8dbe713f0e61788864eb93283b55a9b916270916
        return cadastroRepository.save(cadastro);
    }

    @DeleteMapping("/remove")
    public void removeCadastro(@RequestBody Cadastro cadastro) {
        cadastroRepository.delete(cadastro);
    }

}
