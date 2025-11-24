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
    public NinjaDTO CriarN( @RequestBody  NinjaDTO ninjaD){
        return ninjaservice.CriarNInjas(ninjaD);

    }
    //localhost:8080/NINJAS/mostrarNINJA
    @GetMapping("/mostrarNINJA")
    public List<NinjaDTO> ninjaModelList(){
        return ninjaservice.ninjas();
    }
    //localhost:8080/NINJAS/ID/
    @GetMapping("/ID/{ID}")
    public NinjaDTO ninjaModel(@PathVariable  long ID){
        return ninjaservice.ninjasID(ID);
    }

    @PutMapping("/alterarNINJA/{ID}")
    public NinjaDTO alterarNinaja(@PathVariable long ID,@RequestBody NinjaDTO ninja){
        return ninjaservice.atualizarNinja(ID,ninja);
    }
//localhost:8080/NINJAS/deletarNInJA/{ID}
@DeleteMapping("/deletarNIJA/{ID}")
    public void DeletarNinjasID(@PathVariable long ID){
    ninjaservice.Deletar(ID);
    }


}

