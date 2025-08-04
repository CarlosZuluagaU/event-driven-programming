package com.event.app.publisher;


import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public UserPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishUserRegisteredEvent(){
        System.out.println("Publish event had been published publishUserRegisteredEvent");
        applicationEventPublisher.publishEvent(new UserRegisteredEvent("Carlos", "1234",(byte) 21));
        applicationEventPublisher.publishEvent(new UserRegisteredEvent("Andres", "1234",(byte) 22));
    }

    public void publishUserValidateEvent(String username, boolean isValid){
        System.out.println("Publish event had been published publishUserValidateEvent");
        applicationEventPublisher.publishEvent(new UserValidatedEvent(username, isValid ));
    }
}
