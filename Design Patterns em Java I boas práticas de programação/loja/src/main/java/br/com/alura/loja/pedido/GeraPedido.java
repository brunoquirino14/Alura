package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quandidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quandidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quandidadeItens = quandidadeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public int getQuandidadeItens() {
        return quandidadeItens;
    }
}
