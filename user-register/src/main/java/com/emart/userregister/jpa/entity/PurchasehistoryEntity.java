package com.emart.userregister.jpa.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "purchasehistory", schema = "emart", catalog = "")
public class PurchasehistoryEntity {
    private int id;
    private String itemId;
    private int numberOfItems;
    private Timestamp dateTime;
    private String remarks;
    private String buyerUsername;
    private String sellerUsername;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "item_id")
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "number_of_items")
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Basic
    @Column(name = "date_time")
    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Basic
    @Column(name = "buyer_username")
    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    @Basic
    @Column(name = "seller_username")
    public String getSellerUsername() {
        return sellerUsername;
    }

    public void setSellerUsername(String sellerUsername) {
        this.sellerUsername = sellerUsername;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PurchasehistoryEntity that = (PurchasehistoryEntity) o;

        if (id != that.id) return false;
        if (numberOfItems != that.numberOfItems) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (dateTime != null ? !dateTime.equals(that.dateTime) : that.dateTime != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        if (buyerUsername != null ? !buyerUsername.equals(that.buyerUsername) : that.buyerUsername != null)
            return false;
        if (sellerUsername != null ? !sellerUsername.equals(that.sellerUsername) : that.sellerUsername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + numberOfItems;
        result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (buyerUsername != null ? buyerUsername.hashCode() : 0);
        result = 31 * result + (sellerUsername != null ? sellerUsername.hashCode() : 0);
        return result;
    }
}
