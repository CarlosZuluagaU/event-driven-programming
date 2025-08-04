package com.event.app.publisher;

import com.event.app.event.ProductSoldedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class ProductPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;


    public ProductPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void PublisherEventProduct(){
        System.out.println("Event has been pusblished correctly PublisherEventProduct ");
        applicationEventPublisher.publishEvent(new ProductSoldedEvent("Cocacola", 1000,"102130120aA312"));

    }
}
