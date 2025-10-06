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
public class Geraete {

    private int inventarnummer;

    private int raumnummer;

    private String bezeichnung;

    private int serienummer;

    private String hersteller;

    private boolean defekt;

    private LocalDate einkaufsDatum;

    private LocalDate garantie;

    private float einkaufspreis;
}
