package Dev.java10x.CadastroDeNinjas.MISSOES;

import Dev.java10x.CadastroDeNinjas.NINJAS.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MIssoesModel {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID", unique = true)
Long ID;

@Column(name = "missao")
String NomeDamissao;

@Column(name = "Rank")
String Rank;


@OneToMany(mappedBy = "missoes")
private List<NinjaModel> ninja;

}
