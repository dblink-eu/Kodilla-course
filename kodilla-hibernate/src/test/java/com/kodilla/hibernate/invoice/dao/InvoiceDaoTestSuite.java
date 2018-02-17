package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product2 = new Product("Prod2");
        Product product1 = new Product("Prod1");
        Product product3 = new Product("Prod3");

        Item item1 = new Item(product1,new BigDecimal(100),2);
        Item item2 = new Item(product2,new BigDecimal(150),1);
        Item item3 = new Item(product3,new BigDecimal(200),3);

        Invoice invoice = new Invoice("0001");
        //When
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoiceDao.save(invoice);
        //Then
        Assert.assertNotEquals(0, invoice.getId());
        Assert.assertEquals(new BigDecimal(100),invoice.getItems().get(0).getPrice());
        //CleanUp
        try {
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
