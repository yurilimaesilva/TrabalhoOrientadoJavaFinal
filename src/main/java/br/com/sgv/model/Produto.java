package br.com.sgv.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
/**
 *
 * @author Pablo Rangel <pablo.rangel@gmail.com>
 * @date 22/04/2021
 * @brief class Produto
 */
@Entity
@Getter
@Setter
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Size(min = 1, message = "O nome do produto precisa ser válido.")
    private String nome;
    private float preco;
    @Size(min = 1, max = 50, message = "Máximo 50 caracteres.")
    private String modelo;
    private int estoque;

    @ManyToOne
    @JoinColumn(name = "tamanho_id")
    private Tamanho tamanho;
    
    @Override
    public String toString() {
        return nome;
    }
}
