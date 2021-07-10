package org.sid.gestionstock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cheque {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long chequeId;
    private long number;
    private String Bank;
    private String agency;
    private Date date;
    private double amount;
    @ManyToOne
    private Commande commande;
}
