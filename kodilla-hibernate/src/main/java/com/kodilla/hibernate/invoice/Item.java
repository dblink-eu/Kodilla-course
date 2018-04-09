package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {
    private int Id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return Id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT")
    public Product getProduct() {
        return product;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
