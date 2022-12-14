package com.fastfood.fastfood.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="ELEF_ORDER")
public class Order {
    @Id
    @Column(name="ORDERID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    @Column(name="quantity")
    private int quantity;

    @Column(name="ORDERDATE")
    private LocalDate orderDate;

    @Column(name="ORDERTIME")
    private LocalTime orderTime;

    @Column(name="ORDERPRICE")
    private double orderPrice;

    @Column(name="ORDERSTATUS")
    private String orderStatus;

    @Column(name="STATUSDESCRIPTION")
    private String statusDescription;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="address")
    public Address address;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="BRANCH_ORDER")
    private Branch branch_order;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="customer")
    private User customer;


    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="item")
    private Item item;

    public Order() {

    }


    public Order(int id, int orderId, int quantity, LocalDate orderDate, LocalTime orderTime, double orderPrice,
                 String orderStatus, String statusDescription, Address address, Branch branch_order, User customer,
                 Item item) {
        super();
        this.orderId = orderId;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.statusDescription = statusDescription;
        this.address = address;
        this.branch_order = branch_order;
        this.customer = customer;
        this.item = item;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Branch getBranch_order() {
        return branch_order;
    }

    public void setBranch_order(Branch branch_order) {
        this.branch_order = branch_order;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
