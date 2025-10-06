package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mittarbeiter {

    private int personalnummer;

    private String vorname;

    private String nachname;

    private LocalDate geburtsdatum;

    private String geschlecht;

    private int gehalt;

    private LocalDate eintrittsdatum;
}
