package com.br.marcus.console;

public class Produto {
    private String nomeProduto;
    private int codigoProduto;
    private double valorProduto;
    private int quantidadeProduto;

    public void Produto(){
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
}
