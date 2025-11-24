package Dev.java10x.CadastroDeNinjas.NINJAS;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper  {

    public NinjaModel map(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setID(ninjaDTO.getID());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());
return  ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel){
       NinjaDTO ninjaDTO = new NinjaDTO();
       ninjaDTO.setID(ninjaModel.getID());
       ninjaDTO.setNome(ninjaModel.getNome());
      ninjaDTO.setIdade(ninjaModel.getIdade());
      ninjaDTO.setRank(ninjaModel.getRank());
      ninjaDTO.setMissoes(ninjaModel.getMissoes());
      return ninjaDTO;
    }
}
