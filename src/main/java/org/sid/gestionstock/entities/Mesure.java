package org.sid.gestionstock.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mesure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mesuringId;
    private String label;
    private int coefficient;
    private double price;
    @ManyToOne
    private Product product;
}
