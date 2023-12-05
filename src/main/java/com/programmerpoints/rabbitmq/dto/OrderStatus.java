package com.programmerpoints.rabbitmq.dto;


    public class OrderStatus {

        private CustomerBooking booking;
        private String status;//progress,completed
        private String message;

    public OrderStatus() {
    }

    public CustomerBooking getBooking() {
        return booking;
    }

    public void setBooking(CustomerBooking booking) {
        this.booking = booking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OrderStatus(CustomerBooking booking, String status, String message) {
        this.booking = booking;
        this.status = status;
        this.message = message;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "booking=" + booking +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

