package com.br.marcus.console;

import java.util.ArrayList;

public class Pedido {

    ArrayList<Produto> ProdutoPedido;
    private int codigoPedido;
    private Cliente clientePedido;
    private double valorPedido;

    public void Pedido(Cliente cliente){
        this.clientePedido = cliente;
        ProdutoPedido = new ArrayList<Produto>();
    }

    public String getClientePedido() {
        return clientePedido.getNomeCliente();
    }
    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }
    public int getCodigoPedido() {
        return codigoPedido;
    }
    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }
    public double getValorPedido() {
        return valorPedido;
    }
    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }
}
