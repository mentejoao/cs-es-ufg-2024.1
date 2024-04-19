package endereco;

import java.util.Date;
import java.util.Set;

public class PessoaFisica {
    private String nome;
    private String sexo;
    private Date dataNascimento;
    private Set<Endereco> enderecos; // Utilizando Set ao invés de List

    // Construtor
    public PessoaFisica(String nome, String sexo, Date dataNascimento, Set<Endereco> enderecos) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.enderecos = enderecos;
    }

}