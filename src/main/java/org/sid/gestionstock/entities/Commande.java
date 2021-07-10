package org.sid.gestionstock.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commId;
    private Date commDate;
    private double amount;
    private char paymentMethod;
    private double tva;
    private double amountEsp;
    private double amountCheck;
    @ManyToOne
    private Person person;
    @OneToMany(mappedBy = "commande")
    @JsonIgnore
    private Collection<Cheque> cheques=new LinkedHashSet<>();
    @OneToMany(mappedBy = "commande")
    @JsonIgnore
    private Collection<CommandeLine> commandeLines;
}
