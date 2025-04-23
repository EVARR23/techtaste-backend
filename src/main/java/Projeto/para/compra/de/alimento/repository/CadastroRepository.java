package Projeto.para.compra.de.alimento.repository;

import Projeto.para.compra.de.alimento.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, UUID> {
}
