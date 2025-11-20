package Dev.java10x.CadastroDeNinjas.NINJAS;

import Dev.java10x.CadastroDeNinjas.MISSOES.MIssoesModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "TB_NINJAS")
@JsonPropertyOrder({"ID", "Nome", "Email", "idade", "missoes_ID"})
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true )
    Long ID;
   @Column(name = "idade")
    int idade;

    @Column(name = "Nome")
    String Nome;

    @Column(name = "Email", unique = true )
    String Email;


    @ManyToOne
   @JoinColumn(name = "missoes_ID")
    private MIssoesModel missoes;

    @Column(name = "rank")
    String rank;

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

