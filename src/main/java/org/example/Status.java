package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Status {

    public int s_id;

    public int ng_id;

    public LocalDateTime zeitstempel;

    public boolean erreichbar;

    public LocalTime zeit;
}
