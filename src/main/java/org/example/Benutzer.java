package org.example;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Benutzer {
    private String benutzername;

    private String passwort;

    private boolean administrator;

    private LocalDateTime registration_datum;

    private int personalnummer;
}


