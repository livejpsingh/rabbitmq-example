package com.programmerpoints.rabbitmq.dto;


public class CustomerBooking {

    public String bookingId;
    public String name;
    public int qty;
    public double price;

    public CustomerBooking() {
    }

    public CustomerBooking(String bookingId, String name, int qty, double price) {
        this.bookingId = bookingId;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CustomerBooking{" +
                "bookingId='" + bookingId + '\'' +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }
}
