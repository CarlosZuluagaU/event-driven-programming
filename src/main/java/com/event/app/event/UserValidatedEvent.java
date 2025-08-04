package com.event.app.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserValidatedEvent {

    private String Username;
    private boolean isValid;
}
