package co.capitole.inditex.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRICES")
public class PricesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PRICE_ID")
    private int priceId;

    @Column(name = "BRAND_ID")
    private int brandId;

    @Column(name = "START_DATE")
    private LocalDateTime startDate;

    @Column(name = "END_DATE")
    private LocalDateTime endDate;

    @Column(name = "PRICE_LIST")
    private int priceList;

    @Column(name = "PRODUCT_ID")
    private int productId;

    @Column(name = "PRIORITY")
    private int priority;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "CURR")
    private String curr;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getPriceId() {
        return priceId;
    }

    public int getBrandId() {
        return brandId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public int getPriceList() {
        return priceList;
    }

    public int getProductId() {
        return productId;
    }

    public int getPriority() {
        return priority;
    }

    public double getPrice() {
        return price;
    }

    public String getCurr() {
        return curr;
    }

}
