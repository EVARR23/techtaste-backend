package Projeto.para.compra.de.alimento.model;

import jakarta.persistence.*;
import lombok.*;

import javax.lang.model.element.Name;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cadastro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String nome;
    @Column
    private String email;
    @Column
    private String telefone;
    @Column
    private String cpf;
<<<<<<< HEAD
//    @Column(name="data_de_nascimento")
//    private LocalDate dataDeNascimento;
=======
    @Column(name="data_de_nascimento")
    private LocalDate dataDeNascimento;
>>>>>>> 8dbe713f0e61788864eb93283b55a9b916270916


}
