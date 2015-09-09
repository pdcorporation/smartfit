package br.com.smartfit.web.client.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;
import br.com.smartfit.domain.client.bean.Cliente;

@Path("services/cliente")
public interface ClienteService extends RestService {

  @POST
  @Path("salvarCliente")
  public void salvarCliente(Cliente cliente, MethodCallback<Boolean> callback);
}
