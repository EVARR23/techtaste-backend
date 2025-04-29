package Projeto.para.compra.de.alimento.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class CadastroRequestDTO {
    private UUID id;
    private String nome;
    private  String email;
    private  String telefone;
    private  String cpf;
<<<<<<< HEAD
//    private LocalDate dataDeNascimento;
=======
    private LocalDate dataDeNascimento;
>>>>>>> 8dbe713f0e61788864eb93283b55a9b916270916

}
