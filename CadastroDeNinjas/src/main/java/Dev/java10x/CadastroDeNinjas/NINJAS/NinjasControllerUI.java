package Dev.java10x.CadastroDeNinjas.NINJAS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Nijas/ui")
public class NinjasControllerUI {

    private final Ninjaservice ninjaservice;

    public NinjasControllerUI(Ninjaservice ninjaservice) {
        this.ninjaservice = ninjaservice;
    }

// localhost:8080/Nijas/ui/mostrarNINJA
@GetMapping("/mostrarNINJA")
public String listarNinjas(Model model) {
    List<NinjaDTO> ninjasui =  ninjaservice.ninjas();
    model.addAttribute("ninjas",ninjasui);
return "listarninjas"; // Tem que retornar o nome da pagina que renderiza
}

    @GetMapping("ID/{ID}")
    public String buscarPorId(@PathVariable Long ID,Model model) {
        NinjaDTO nija = ninjaservice.ninjasID(ID);

        if (ninjaservice.ninjasID(ID)  != null){

            model.addAttribute("ninjas",nija);
            return "ninjas encontrados";
        }else {
            return null; }
    }

}


