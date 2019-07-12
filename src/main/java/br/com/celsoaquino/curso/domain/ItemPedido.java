package br.com.celsoaquino.curso.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class ItemPedido implements Serializable {

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private BigDecimal desconto;
    private Integer quantidade;
    private BigDecimal preco;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, BigDecimal desconto, Integer quantidade, BigDecimal preco) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Pedido getPedido(){
        return id.getPedido();
    }

    public Produto getProduto(){
        return id.getProduto();
    }

    public ItemPedidoPK getId() {
        return id;
    }

    public void setId(ItemPedidoPK id) {
        this.id = id;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ItemPedido)) return false;
        ItemPedido that = (ItemPedido) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
