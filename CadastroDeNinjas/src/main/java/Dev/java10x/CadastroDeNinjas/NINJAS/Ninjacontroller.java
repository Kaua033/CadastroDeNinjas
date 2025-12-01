package Dev.java10x.CadastroDeNinjas.NINJAS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public String teste() {
        return "oi";
    }
    //criar ninjas

    @PostMapping("/criarNINJA")
    public ResponseEntity<String> CriarN(@RequestBody NinjaDTO ninjaD) {
        NinjaDTO novoNinja = ninjaservice.CriarNInjas(ninjaD);
      return  ResponseEntity.status(HttpStatus.CREATED).body("Ninja Criado com sucesso" + novoNinja.getNome() + "(ID)" + novoNinja.getID());

    }

    //localhost:8080/NINJAS/mostrarNINJA
    @GetMapping("/mostrarNINJA")
    public ResponseEntity< List<NinjaDTO>>  ninjaModelList() {
        List<NinjaDTO> ninjas = ninjaservice.ninjas();
        return ResponseEntity.ok(ninjas);
    }
    //localhost:8080/NINJAS/ID/



    @GetMapping("ID/{ID}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long ID) {
       NinjaDTO nija = ninjaservice.ninjasID(ID);
        if (ninjaservice.ninjasID(ID)  != null){
           return ResponseEntity.ok("ninja" + nija.getNome() + "achado com susceso");
       }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("o tal  ninja" + ID + "nao foi encontardo");
       }
    }


    @PutMapping("/alterarNINJA/{ID}")
    public ResponseEntity<?> alterarNinaja(@PathVariable long ID, @RequestBody NinjaDTO ninja) {
      NinjaDTO ninjaAT = ninjaservice.atualizarNinja(ID, ninja);
    if (ninjaservice.ninjasID(ID) != null){
        return ResponseEntity.ok(ninja);
    }else {
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("o ninja");
    }
    }


    //localhost:8080/NINJAS/deletarNInJA/{ID}
    @DeleteMapping("/deletarNIJA/{ID}")
    public ResponseEntity<String> DeletarNinjasID(@PathVariable long ID) {

        if (ninjaservice.ninjasID(ID) != null) {
            ninjaservice.ninjasID(ID);
            return ResponseEntity.ok("O Ninja " + ID + "foi deletado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja " + ID + "Nao encontrado");


        }


    }
}
