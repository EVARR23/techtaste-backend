package Projeto.para.compra.de.alimento.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate dataDeNascimento;


}
