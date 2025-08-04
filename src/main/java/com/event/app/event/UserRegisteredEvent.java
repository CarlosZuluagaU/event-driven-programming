package com.event.app.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class UserRegisteredEvent {

    //Evento que se hizo o que se dispara

    private String name;
    private String password;
    private byte age ;

    //Necesitamos un publicador de eventos
    //Clase encargada de publicar mis envetos

}
