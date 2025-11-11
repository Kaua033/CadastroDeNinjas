package Dev.java10x.CadastroDeNinjas.MISSOES;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MissoesRepository extends JpaRepository<MIssoesModel, Long> {
}
