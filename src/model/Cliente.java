package model;


public class Cliente {

    int idMesa;
    String nomeCliente;


    public int getIdMesa(){
        return idMesa;

    }
    public void setIdMesa(int idMesaDigitado){
        this.idMesa = idMesaDigitado;

    }

    public String getNomeCliente() {
        return nomeCliente;

    }
    public void setNomeCliente(String nomeClienteDigitado) {
        this.nomeCliente = nomeClienteDigitado;

    }


}
