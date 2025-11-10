package MISSOES;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MIssoesModel {
@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
Long ID;
@Column(name = "missao")
String NomeDamissao;
@Column(name = "Rank")
String Rank;


}
