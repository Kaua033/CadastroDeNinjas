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

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long setID() {
        return ID;
    }
}

