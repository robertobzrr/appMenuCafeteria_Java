package service;

import model.Cliente;
import model.RegistroPedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<RegistroPedido> registros = new ArrayList<>();

    public void criarRegistro(Cliente cliente) {
        registros.add(new RegistroPedido(cliente));
    }

    public RegistroPedido buscarPorMesa(int mesa) {
        for(RegistroPedido registro : registros) {
            if(registro.getCliente().getIdMesa() == mesa) {
                return registro;
            }
        }
        return null;
    }
}