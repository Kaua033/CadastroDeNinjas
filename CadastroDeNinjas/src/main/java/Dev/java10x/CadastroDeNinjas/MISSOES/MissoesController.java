package Dev.java10x.CadastroDeNinjas.MISSOES;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("MISSOES")
public class MissoesController {
  //localhost:8080/teste/criar
  @GetMapping("/teste")
  public String teste(){
      return "oi";
  }
    //criar ninjas
    @PostMapping("/criarMISSAO")
    public String criar(){
        return "moss";

}
    @GetMapping("/mostrarmissaoID")
public String mostrarID(){
    return "mostrar";
}

@GetMapping("/mostrar missao")
    public String mostrar(){
        return "mostrar";
    }

@PutMapping("/alterarMissao")
public  String alterar(){
        return "alterar Missao";
}

@DeleteMapping("/deletar")
    public String deletarM(){
        return "deletar missao";
}
}
