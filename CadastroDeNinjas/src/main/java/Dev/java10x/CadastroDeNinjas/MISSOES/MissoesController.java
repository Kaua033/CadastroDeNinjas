package Dev.java10x.CadastroDeNinjas.MISSOES;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {
  //localhost:8080/teste
    @GetMapping("/teste")
    public String teste(){
        return "oi";
    }
}
