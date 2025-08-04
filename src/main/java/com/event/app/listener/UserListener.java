package com.event.app.listener;

import com.event.app.event.ProductSoldedEvent;
import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {


    @EventListener
    public UserValidatedEvent listenerUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){

        System.out.println("Escuchando, el evento ha sido escuhado".concat(userRegisteredEvent.toString()));
        return new UserValidatedEvent(userRegisteredEvent.getName(), true);

    }
    @EventListener
    public void listenerUserValidateEvent(UserValidatedEvent userValidatedEvent){
        System.out.println("LISTENING: Event has been listened --> ".concat(userValidatedEvent.toString()));
    }
    @EventListener
    public void listenerProductPublisherEvent(ProductSoldedEvent productSoldedEvent){
        System.out.println("LISTENIGN: Event has been listened --> ".concat(productSoldedEvent.toString()));
    }
}
