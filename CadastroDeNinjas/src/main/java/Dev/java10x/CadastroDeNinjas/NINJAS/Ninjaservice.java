package Dev.java10x.CadastroDeNinjas.NINJAS;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Ninjaservice {

private NinjaMapper ninjaMapper;

private NINJARepository ninjaRepository;

    public Ninjaservice(NinjaMapper ninjaMapper, NINJARepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaDTO> ninjas() {
      List<NinjaModel> ninjaModels =ninjaRepository.findAll();
      return ninjaModels.stream().map(ninjaMapper::map).collect(Collectors.toList( ));
    }


    public NinjaDTO ninjasID(long ID) {
        Optional<NinjaModel> ninjaDTO = ninjaRepository.findById(ID);
        return ninjaDTO.map(ninjaMapper::map).orElse(null);
    }



    public NinjaDTO CriarNInjas(NinjaDTO ninjaD){
        NinjaModel ninja = ninjaMapper.map(ninjaD);
                ninja =ninjaRepository.save(ninja);
    return ninjaMapper.map(ninja);
    }

    public  void  Deletar(Long ID) {
        ninjaRepository.deleteById(ID);
    }


    public NinjaDTO atualizarNinja(Long ID, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(ID);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setID(ID);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }


}

