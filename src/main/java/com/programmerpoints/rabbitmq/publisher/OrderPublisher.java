package com.programmerpoints.rabbitmq.publisher;


import com.programmerpoints.rabbitmq.config.MessagingConfig;
import com.programmerpoints.rabbitmq.dto.CustomerBooking;
import com.programmerpoints.rabbitmq.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{carDealerName}")
    public String bookOrder(@RequestBody CustomerBooking customerBooking, @PathVariable String carDealerName) {

        customerBooking.setBookingId(UUID.randomUUID().toString());
        //dealerservice
        //payment service
        OrderStatus orderStatus = new OrderStatus(customerBooking, "PROCESS", "order placed succesfully in ");
        template.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderStatus);
        return "Success !!";
    }
}
