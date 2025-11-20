package Dev.java10x.CadastroDeNinjas.NINJAS;

import Dev.java10x.CadastroDeNinjas.MISSOES.MIssoesModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class NinjaDTO {

     private Long ID;
    private int idade;
    private String Nome;
    private String Email;
    private MIssoesModel missoes;
    private String rank;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public MIssoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MIssoesModel missoes) {
        this.missoes = missoes;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}