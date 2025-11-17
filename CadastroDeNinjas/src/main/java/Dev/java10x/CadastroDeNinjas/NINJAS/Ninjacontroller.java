package Dev.java10x.CadastroDeNinjas.NINJAS;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("NINJAS")
public class Ninjacontroller {
//localhost:8080/NINJAS/mostrarNINJAID
    private final Ninjaservice ninjaservice;

    public Ninjacontroller(Ninjaservice ninjaservice) {
        this.ninjaservice = ninjaservice;
    }

    @GetMapping("/teste")
    public String teste(){
        return "oi";
    }
    //criar ninjas

    @PostMapping("/criarNINJA")
    public NinjaModel CriarN( @RequestBody  NinjaModel ninjaModel){
        return ninjaservice.CriarNInjas(ninjaModel);

    }
    //localhost:8080/NINJAS/mostrarNINJA
    @GetMapping("/mostrarNINJA")
    public List<NinjaModel> ninjaModelList(){
        return ninjaservice.ninjas();
    }
    //localhost:8080/NINJAS/ID/
    @GetMapping("/ID/{ID}")
    public NinjaModel ninjaModel(@PathVariable  long ID){
        return ninjaservice.ninjasID(ID);
    }

    @PutMapping("/alterarNINJA/{ID}")
    public NinjaModel alterarNinaja(@PathVariable long ID,@RequestBody NinjaModel ninjaModel){
        return ninjaservice.atualizarNinja(ID,ninjaModel);
    }
//localhost:8080/NINJAS/deletarNInJA/{ID}
@DeleteMapping("/deletarNIJA/{ID}")
    public void DeletarNinjasID(@PathVariable long ID){
    ninjaservice.Deletar(ID);
    }


}

