package com.emart.userregister.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart", schema = "emart")
public class CartEntity {
    private int id;
    private int itemName;
    private Integer count;
    private int itemId;
    private String buyerUsername;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "item_name")
    public int getItemName() {
        return itemName;
    }

    public void setItemName(int itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartEntity that = (CartEntity) o;

        if (id != that.id) return false;
        if (itemName != that.itemName) return false;
        if (count != null ? !count.equals(that.count) : that.count != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + itemName;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        return result;
    }

//    @Basic
//    @Column(name = "buyer_id")
//    public int getBuyerId() {
//        return buyerId;
//    }
//
//    public void setBuyerId(int buyerId) {
//        this.buyerId = buyerId;
//    }

    @Basic
    @Column(name = "item_id")
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "buyer_username")
    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }
}
