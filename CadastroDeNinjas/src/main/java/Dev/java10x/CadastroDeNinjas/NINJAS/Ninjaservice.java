package Dev.java10x.CadastroDeNinjas.NINJAS;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Ninjaservice {



private NINJARepository ninjaRepository;

    public Ninjaservice(NINJARepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> ninjas() {
    return ninjaRepository.findAll();
}


    public NinjaModel ninjasID(long ID) {
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(ID);
        return ninjaModel.orElse(null);
    }



    public NinjaModel CriarNInjas(NinjaModel ninjaModel){
        return ninjaRepository.save(ninjaModel);
    }

    public  void  Deletar(Long ID) {
        ninjaRepository.deleteById(ID);
    }


    public NinjaModel atualizarNinja(Long ID, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(ID)) {
            ninjaAtualizado.setID(ID);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }


}

