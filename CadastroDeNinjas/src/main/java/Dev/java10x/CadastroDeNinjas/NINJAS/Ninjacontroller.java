package Dev.java10x.CadastroDeNinjas.NINJAS;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("NINJAS")
public class Ninjacontroller {
    @GetMapping("/teste")
    public String teste(){
        return "oi";
    }
    //criar ninjas
    @PostMapping("/criarNINJA")
    public String criar(){
        return "moss";

    }
    @GetMapping("/mostrarNINJAID")
    public String mostrarID(){
        return "mostrar";
    }

    @GetMapping("/mostrarNINJAS")
    public String mostrar(){
        return "mostrar";
    }

    @PutMapping("/alterarNINJA")
    public  String alterar(){
        return "alterar Missao";
    }

    @DeleteMapping("/deletarNIJA")
    public String deletarM(){
        return "deletar missao";
    }
}
