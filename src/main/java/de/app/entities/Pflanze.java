package de.app.entities;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Date;

@Component
@AllArgsConstructor
public abstract class Pflanze {

    @Id
    String name;

    String beschreibung;

    Date bluete;

    Date pflanzbarAb;

    Duration bewaesserungsintervall;

    Pflanzenfamilie pflanzenfamilie;

}
