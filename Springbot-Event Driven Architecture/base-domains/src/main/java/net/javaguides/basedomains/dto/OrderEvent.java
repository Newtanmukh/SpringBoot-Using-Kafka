package net.javaguides.basedomains.dto;


//class which we are going to use to transfer the data between producer and consumer using kafka

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEvent {
    private String message;

    private String status;

    private Order order;
}
