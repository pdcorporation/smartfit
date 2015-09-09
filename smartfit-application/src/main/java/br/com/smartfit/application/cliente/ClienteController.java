package br.com.smartfit.application.cliente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.smartfit.domain.client.bean.Cliente;

@Controller
@RequestMapping("cliente")
public class ClienteController {

  @ResponseBody
  @RequestMapping(value = "salvarCliente", method = RequestMethod.POST)
  public boolean salvarCliente(@RequestBody Cliente cliente) {
    System.out.println(cliente.getNomeCliente());
    return true;
  }
}
