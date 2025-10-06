package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Netzwerkgeraete {

    public int ng_id;

    public int inventarnummer;

    public String ipv4adresse;

    public String hostname;
}
